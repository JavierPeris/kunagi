package scrum.client.collaboration;

import ilarkesto.gwt.client.TableBuilder;

import java.util.Map;

import scrum.client.ScrumGwt;
import scrum.client.project.Project;

import com.google.gwt.user.client.ui.Widget;

public class Subject extends GSubject implements ForumSupport {

	public static final String REFERENCE_PREFIX = "sbj";

	public Subject(Project project) {
		setProject(project);
	}

	public Subject(Map data) {
		super(data);
	}

	@Override
	public String getReference() {
		return REFERENCE_PREFIX + getNumber();
	}

	@Override
	public String toHtml() {
		return ScrumGwt.toHtml(this, getLabel());
	}

	@Override
	public Widget createForumItemWidget() {
		TableBuilder tb = ScrumGwt.createFieldTable();
		tb.addFieldRow("Title", getLabelModel());
		tb.addFieldRow("Notes", getTextModel());
		return tb.createTable();
	}

	@Override
	public String toString() {
		return getReference() + " " + getLabel();
	}

}