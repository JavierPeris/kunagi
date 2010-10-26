package scrum.client.project;

import ilarkesto.core.base.Utl;
import ilarkesto.core.scope.Scope;
import ilarkesto.gwt.client.Date;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.HyperlinkWidget;
import ilarkesto.gwt.client.editor.AFieldModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import scrum.client.ScrumGwt;
import scrum.client.admin.Auth;
import scrum.client.admin.User;
import scrum.client.collaboration.ForumSupport;
import scrum.client.common.LabelSupport;
import scrum.client.common.ReferenceSupport;
import scrum.client.common.ShowEntityAction;
import scrum.client.estimation.RequirementEstimationVote;
import scrum.client.impediments.Impediment;
import scrum.client.issues.Issue;
import scrum.client.sprint.Sprint;
import scrum.client.sprint.Task;

import com.google.gwt.user.client.ui.Widget;

public class Requirement extends GRequirement implements ReferenceSupport, LabelSupport, ForumSupport {

	public static final String REFERENCE_PREFIX = "sto";
	public static String[] WORK_ESTIMATION_VALUES = new String[] { "", "0.5", "1", "2", "3", "5", "8", "13", "20",
			"40", "100" };

	private transient EstimationBar estimationBar;
	private transient Comparator<Task> tasksOrderComparator;

	public Requirement(Project project) {
		setProject(project);
		setDirty(true);
	}

	public Requirement(Issue issue) {
		setProject(issue.getProject());
		setLabel(issue.getLabel());
		setDescription(issue.getDescription());
	}

	public Requirement(Map data) {
		super(data);
	}

	public boolean isDecidable() {
		if (!isTasksClosed()) return false;
		if (getRejectDate() != null) return false;
		return true;
	}

	public boolean isRejected() {
		if (isClosed()) return false;
		if (!isTasksClosed()) return false;
		if (!isInCurrentSprint()) return false;
		return getRejectDate() != null;
	}

	public void reject() {
		setRejectDate(Date.today());
	}

	public void fix() {
		setRejectDate(null);
	}

	public String getEstimatedWorkAsString() {
		Float work = getEstimatedWork();
		if (work == null) return null;
		if (work <= 0.5f) return work.toString();
		return String.valueOf(work.intValue());
	}

	public String getEstimatedWorkWithUnit() {
		String work = getEstimatedWorkAsString();
		return work == null ? null : work + " " + getProject().getEffortUnit();
	}

	public List<RequirementEstimationVote> getEstimationVotes() {
		return getDao().getRequirementEstimationVotesByRequirement(this);
	}

	public boolean containsWorkEstimationVotes() {
		for (RequirementEstimationVote vote : getEstimationVotes()) {
			if (vote.getEstimatedWork() != null) return true;
		}
		return false;
	}

	public RequirementEstimationVote getEstimationVote(User user) {
		for (RequirementEstimationVote vote : getEstimationVotes()) {
			if (vote.isUser(user)) return vote;
		}
		return null;
	}

	public void setVote(Float estimatedWork) {
		RequirementEstimationVote vote = getEstimationVote(Scope.get().getComponent(Auth.class).getUser());
		if (vote == null) throw new IllegalStateException("vote == null");
		vote.setEstimatedWork(estimatedWork);
		if (estimatedWork != null && isWorkEstimationVotingComplete()) activateWorkEstimationVotingShowoff();
		updateLocalModificationTime();
	}

	public boolean isWorkEstimationVotingComplete() {
		for (User user : getProject().getTeamMembers()) {
			RequirementEstimationVote vote = getEstimationVote(user);
			if (vote == null || vote.getEstimatedWork() == null) return false;
		}
		return true;
	}

	public void deactivateWorkEstimationVoting() {
		setWorkEstimationVotingActive(false);
	}

	public void activateWorkEstimationVotingShowoff() {
		setWorkEstimationVotingShowoff(true);
	}

	public String getTaskStatusLabel() {
		int burned = Task.sumBurnedWork(getTasks());
		int remaining = Task.sumRemainingWork(getTasks());
		if (remaining == 0) return "100% completed, " + burned + " hrs burned";
		int burnedPercent = Gwt.percent(burned + remaining, burned);
		return burnedPercent + "% completed, " + remaining + " hrs left";
	}

	public void setEstimationBar(EstimationBar estimationBar) {
		if (Utl.equals(this.estimationBar, estimationBar)) return;
		this.estimationBar = estimationBar;
		updateLocalModificationTime();
	}

	public EstimationBar getEstimationBar() {
		return estimationBar;
	}

	public boolean isValidForSprint() {
		if (!isEstimatedWorkValid()) return false;
		return true;
	}

	public boolean isEstimatedWorkValid() {
		return !isDirty() && getEstimatedWork() != null;
	}

	public String getLongLabel() {
		StringBuilder sb = new StringBuilder();
		sb.append(getLabel());
		if (!isEstimatedWorkValid()) sb.append(" [requires estimation]");
		if (isInCurrentSprint()) sb.append(" [In Sprint]");
		return sb.toString();
	}

	public boolean isInCurrentSprint() {
		return isSprintSet() && getProject().isCurrentSprint(getSprint());
	}

	public String getReferenceAndLabel() {
		return getReference() + " " + getLabel();
	}

	@Override
	public String getReference() {
		return REFERENCE_PREFIX + getNumber();
	}

	/**
	 * No tasks created yet.
	 */
	public boolean isPlanned() {
		return !getTasks().isEmpty();
	}

	/**
	 * All tasks are done. Not closed yet.
	 */
	public boolean isTasksClosed() {
		Collection<Task> tasks = getTasks();
		if (tasks.isEmpty()) return false;
		for (Task task : tasks) {
			if (!task.isClosed()) return false;
		}
		return true;
	}

	/**
	 * Summary to show in the product backlog.
	 */
	public String getProductBacklogSummary() {
		String summary = isDirty() ? "[dirty] " : "[not dirty] ";
		if (isClosed()) return summary += "Closed.";
		if (isTasksClosed()) return summary += "Done. Test required.";
		if (getEstimatedWork() == null) return summary += "No effort estimated.";
		if (!isSprintSet()) return summary += getEstimatedWorkWithUnit() + " to do. No sprint assigned.";
		Sprint sprint = getSprint();
		return summary += getEstimatedWorkWithUnit() + " to do in sprint " + sprint.getLabel() + ".";
	}

	/**
	 * Summary to show in the sprint backlog.
	 */
	public String getSprintBacklogSummary() {
		if (isClosed()) return "Closed.";
		if (!isPlanned()) return "Not planned yet.";
		if (isTasksClosed()) return "Done. Test required.";
		int taskCount = 0;
		int openTaskCount = 0;
		int effort = 0;
		for (Task task : getTasks()) {
			taskCount++;
			if (!task.isClosed()) {
				openTaskCount++;
				effort += task.getRemainingWork();
			}
		}
		return openTaskCount + " of " + taskCount + " Tasks open. About " + effort + " hours to do.";
	}

	public int getBurnedWorkInClosedTasks() {
		return Task.sumBurnedWork(getClosedTasks());
	}

	public int getBurnedWork() {
		return Task.sumBurnedWork(getTasks());
	}

	public int getBurnedWorkInClaimedTasks() {
		return Task.sumBurnedWork(getClaimedTasks());
	}

	public int getRemainingWorkInClaimedTasks() {
		return Task.sumRemainingWork(getClaimedTasks());
	}

	public int getRemainingWorkInUnclaimedTasks() {
		return Task.sumRemainingWork(getUnclaimedTasks());
	}

	public int getRemainingWork() {
		return Task.sumRemainingWork(getTasks());
	}

	public List<Task> getClaimedTasks() {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasks()) {
			if (task.isOwnerSet() && !task.isClosed()) ret.add(task);
		}
		return ret;
	}

	public List<Task> getClaimedTasks(User owner) {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasks()) {
			if (task.isOwner(owner) && !task.isClosed()) ret.add(task);
		}
		return ret;
	}

	public List<Task> getClosedTasks() {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasks()) {
			if (task.isClosed()) ret.add(task);
		}
		return ret;
	}

	public List<Task> getUnclaimedTasks() {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasks()) {
			if (task.isClosed() || task.isOwnerSet()) continue;
			ret.add(task);
		}
		return ret;
	}

	public List<Task> getTasksBlockedBy(Impediment impediment) {
		List<Task> ret = new ArrayList<Task>();
		for (Task task : getTasks()) {
			if (task.isImpediment(impediment)) ret.add(task);
		}
		return ret;
	}

	public List<Task> getTasks() {
		return getDao().getTasksByRequirement(this);
	}

	public static int sumBurnedWork(Iterable<Requirement> requirements) {
		int sum = 0;
		for (Requirement requirement : requirements) {
			sum += requirement.getBurnedWork();
		}
		return sum;
	}

	public Task createNewTask() {
		Task task = new Task(this);
		getDao().createTask(task);
		updateTasksOrder();
		return task;
	}

	public void deleteTask(Task task) {
		getDao().deleteTask(task);
	}

	@Override
	public boolean isEditable() {
		if (isInCurrentSprint()) return false;
		if (!getProject().isProductOwner(Scope.get().getComponent(Auth.class).getUser())) return false;
		return true;
	}

	@Override
	public String toHtml() {
		return ScrumGwt.toHtml(getReference(), getLabel());
	}

	@Override
	public String toString() {
		return getReferenceAndLabel();
	}

	@Override
	public Widget createForumItemWidget() {
		return new HyperlinkWidget(new ShowEntityAction(this, getLabel()));
	}

	private void updateTasksOrder() {
		List<Task> tasks = getTasks();
		Collections.sort(tasks, getTasksOrderComparator());
		updateTasksOrder(tasks);
	}

	public void updateTasksOrder(List<Task> tasks) {
		setTasksOrderIds(Gwt.getIdsAsList(tasks));
	}

	public Comparator<Task> getTasksOrderComparator() {
		if (tasksOrderComparator == null) tasksOrderComparator = new Comparator<Task>() {

			@Override
			public int compare(Task a, Task b) {
				List<String> order = getTasksOrderIds();
				int additional = order.size();
				int ia = order.indexOf(a.getId());
				if (ia < 0) {
					ia = additional;
					additional++;
				}
				int ib = order.indexOf(b.getId());
				if (ib < 0) {
					ib = additional;
					additional++;
				}
				return ia - ib;
			}
		};
		return tasksOrderComparator;
	}

	private AFieldModel<String> estimatedWorkWithUnitModel;

	public AFieldModel<String> getEstimatedWorkWithUnitModel() {
		if (estimatedWorkWithUnitModel == null) estimatedWorkWithUnitModel = new AFieldModel<String>() {

			@Override
			public String getValue() {
				return getEstimatedWorkWithUnit();
			}
		};
		return estimatedWorkWithUnitModel;
	}

	private transient AFieldModel<String> taskStatusLabelModel;

	public AFieldModel<String> getTaskStatusLabelModel() {
		if (taskStatusLabelModel == null) taskStatusLabelModel = new AFieldModel<String>() {

			@Override
			public String getValue() {
				return getTaskStatusLabel();
			}
		};
		return taskStatusLabelModel;
	}

}
