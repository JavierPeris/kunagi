package scrum.client.project;

import ilarkesto.gwt.client.ButtonWidget;
import ilarkesto.gwt.client.TableBuilder;
import ilarkesto.gwt.client.editor.RichtextEditorWidget;
import scrum.client.ScrumGwt;
import scrum.client.admin.ProjectBlock;
import scrum.client.common.AScrumWidget;
import scrum.client.common.WeekdaySelectorEditorWidget;
import scrum.client.workspace.PagePanel;

import com.google.gwt.user.client.ui.Widget;

public class ProjectAdminWidget extends AScrumWidget {

	@Override
	protected Widget onInitialization() {

		final Project project = getCurrentProject();

		PagePanel page = new PagePanel();

		page.addHeader("Project Properties");
		TableBuilder tbPro = ScrumGwt.createFieldTable();
		tbPro.addFieldRow("Name", project.getLabelModel());
		tbPro.addFieldRow("Vision", new RichtextEditorWidget(project.getVisionModel()));
		ProjectBlock.addRolesFieldRows(project, tbPro);
		tbPro.addFieldRow("Free days", new WeekdaySelectorEditorWidget(project.getFreeDaysWeekdaySelectorModel()));
		page.addSection(tbPro.createTable());

		page.addHeader("Product Descriptions");
		TableBuilder tbDescr = ScrumGwt.createFieldTable();
		tbDescr.addFieldRow("Name", project.getProductLabelModel());
		tbDescr.addFieldRow("Tagline", project.getShortDescriptionModel());
		tbDescr.addFieldRow("Short Description", project.getDescriptionModel());
		tbDescr.addFieldRow("Long Description", project.getLongDescriptionModel());
		page.addSection(tbDescr.createTable());

		page.addHeader("Project Homepage", new ButtonWidget(new UpdateProjectHomepageAction(project)));
		TableBuilder tbHomepage = ScrumGwt.createFieldTable();
		tbHomepage.addFieldRow("Homepage Directory", project.getHomepageDirModel());
		tbHomepage.addFieldRow("Homepage URL", project.getHomepageUrlModel());
		tbHomepage.addFieldRow("Update automatically", project.getAutoUpdateHomepageModel());
		page.addSection(tbHomepage.createTable());

		page.addHeader("Project Support");
		TableBuilder tbSupport = ScrumGwt.createFieldTable();
		tbSupport.addFieldRow("Support Email", project.getSupportEmailModel());
		tbSupport.addFieldRow("Issue reply template", project.getIssueReplyTemplateModel());
		page.addSection(tbSupport.createTable());

		return page;
	}
}
