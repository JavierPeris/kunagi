// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtEntityGenerator










package scrum.client.collaboration;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GChatMessage
            extends scrum.client.common.AScrumGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    @Override
    protected void doPersist() {
        getDao().createChatMessage((ChatMessage)this);
    }

    @Override
    public void delete() {
        getDao().deleteChatMessage((ChatMessage)this);
    }

    public GChatMessage() {
    }

    public GChatMessage(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "ChatMessage";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- project ---

    private String projectId;

    public final scrum.client.project.Project getProject() {
        if (projectId == null) return null;
        return getDao().getProject(this.projectId);
    }

    public final boolean isProjectSet() {
        return projectId != null;
    }

    public final ChatMessage setProject(scrum.client.project.Project project) {
        String id = project == null ? null : project.getId();
        if (ilarkesto.core.base.Utl.equals(this.projectId, id)) return (ChatMessage) this;
        this.projectId = id;
        propertyChanged("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        return (ChatMessage)this;
    }

    public final boolean isProject(scrum.client.project.Project project) {
        String id = project==null ? null : project.getId();
        return ilarkesto.core.base.Utl.equals(this.projectId, id);
    }

    // --- author ---

    private String authorId;

    public final scrum.client.admin.User getAuthor() {
        if (authorId == null) return null;
        return getDao().getUser(this.authorId);
    }

    public final boolean isAuthorSet() {
        return authorId != null;
    }

    public final ChatMessage setAuthor(scrum.client.admin.User author) {
        String id = author == null ? null : author.getId();
        if (ilarkesto.core.base.Utl.equals(this.authorId, id)) return (ChatMessage) this;
        this.authorId = id;
        propertyChanged("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
        return (ChatMessage)this;
    }

    public final boolean isAuthor(scrum.client.admin.User author) {
        String id = author==null ? null : author.getId();
        return ilarkesto.core.base.Utl.equals(this.authorId, id);
    }

    // --- text ---

    private java.lang.String text ;

    public final java.lang.String getText() {
        return this.text ;
    }

    public final ChatMessage setText(java.lang.String text) {
        if (isText(text)) return (ChatMessage)this;
        if (ilarkesto.core.base.Str.isBlank(text)) throw new RuntimeException("Field is mandatory.");
        this.text = text ;
        propertyChanged("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
        return (ChatMessage)this;
    }

    public final boolean isText(java.lang.String text) {
        return ilarkesto.core.base.Utl.equals(this.text, text);
    }

    private transient TextModel textModel;

    public TextModel getTextModel() {
        if (textModel == null) textModel = createTextModel();
        return textModel;
    }

    protected TextModel createTextModel() { return new TextModel(); }

    protected class TextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ChatMessage_text";
        }

        @Override
        public java.lang.String getValue() {
            return getText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setText(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    // --- dateAndTime ---

    private ilarkesto.core.time.DateAndTime dateAndTime ;

    public final ilarkesto.core.time.DateAndTime getDateAndTime() {
        return this.dateAndTime ;
    }

    public final ChatMessage setDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (isDateAndTime(dateAndTime)) return (ChatMessage)this;
        this.dateAndTime = dateAndTime ;
        propertyChanged("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
        return (ChatMessage)this;
    }

    public final boolean isDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        return ilarkesto.core.base.Utl.equals(this.dateAndTime, dateAndTime);
    }

    private transient DateAndTimeModel dateAndTimeModel;

    public DateAndTimeModel getDateAndTimeModel() {
        if (dateAndTimeModel == null) dateAndTimeModel = createDateAndTimeModel();
        return dateAndTimeModel;
    }

    protected DateAndTimeModel createDateAndTimeModel() { return new DateAndTimeModel(); }

    protected class DateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "ChatMessage_dateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- update properties by map ---

    public void updateProperties(Map<String, String> properties) {
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            String property = entry.getKey();
            if (property.equals("id")) continue;
            String value = entry.getValue();
            if (property.equals("projectId")) projectId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("authorId")) authorId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("text")) text = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("dateAndTime")) dateAndTime = ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value);
        }
        updateLastModified();
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("authorId", ilarkesto.core.persistance.Persistence.propertyAsString(this.authorId));
        properties.put("text", ilarkesto.core.persistance.Persistence.propertyAsString(this.text));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
    }

}