package scrum.client.calendar;

import ilarkesto.core.base.Str;
import ilarkesto.gwt.client.DateAndTime;
import ilarkesto.gwt.client.Gwt;
import ilarkesto.gwt.client.Time;
import scrum.client.journal.ProjectEvent;

public class PublishSimpleEventAction extends GPublishSimpleEventAction {

	public PublishSimpleEventAction(scrum.client.calendar.SimpleEvent simpleEvent) {
		super(simpleEvent);
	}

	@Override
	public String getLabel() {
		return "Publish Notification";
	}

	@Override
	public String getTooltip() {
		return "Add a notification for this event to the project journal.";
	}

	@Override
	protected void onExecute() {
		String suffix = Gwt.formatWeekdayMonthDay(simpleEvent.getDate().toJavaDate());
		Time time = simpleEvent.getTime();
		if (time != null)
			suffix += ", " + Gwt.formatHourMinute(new DateAndTime(simpleEvent.getDate(), time).toJavaDate());
		String location = simpleEvent.getLocation();
		if (!Str.isBlank(location)) suffix += " @ " + location;
		getDao().createProjectEvent(
			new ProjectEvent(getCurrentProject(), simpleEvent.getLabel() + " scheduled to " + suffix));
	}

}