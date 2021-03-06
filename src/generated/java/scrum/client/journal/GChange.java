// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtEntityGenerator










package scrum.client.journal;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GChange
            extends scrum.client.common.AScrumGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    @Override
    protected void doPersist() {
        getDao().createChange((Change)this);
    }

    @Override
    public void delete() {
        getDao().deleteChange((Change)this);
    }

    public GChange() {
    }

    public GChange(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "Change";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- parent ---

    private String parentId;

    public final ilarkesto.gwt.client.AGwtEntity getParent() {
        if (parentId == null) return null;
        return getDao().getEntity(this.parentId);
    }

    public final boolean isParentSet() {
        return parentId != null;
    }

    public final Change setParent(ilarkesto.gwt.client.AGwtEntity parent) {
        String id = parent == null ? null : parent.getId();
        if (ilarkesto.core.base.Utl.equals(this.parentId, id)) return (Change) this;
        this.parentId = id;
        propertyChanged("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
        return (Change)this;
    }

    public final boolean isParent(ilarkesto.gwt.client.AGwtEntity parent) {
        String id = parent==null ? null : parent.getId();
        return ilarkesto.core.base.Utl.equals(this.parentId, id);
    }

    // --- user ---

    private String userId;

    public final scrum.client.admin.User getUser() {
        if (userId == null) return null;
        return getDao().getUser(this.userId);
    }

    public final boolean isUserSet() {
        return userId != null;
    }

    public final Change setUser(scrum.client.admin.User user) {
        String id = user == null ? null : user.getId();
        if (ilarkesto.core.base.Utl.equals(this.userId, id)) return (Change) this;
        this.userId = id;
        propertyChanged("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        return (Change)this;
    }

    public final boolean isUser(scrum.client.admin.User user) {
        String id = user==null ? null : user.getId();
        return ilarkesto.core.base.Utl.equals(this.userId, id);
    }

    // --- dateAndTime ---

    private ilarkesto.core.time.DateAndTime dateAndTime ;

    public final ilarkesto.core.time.DateAndTime getDateAndTime() {
        return this.dateAndTime ;
    }

    public final Change setDateAndTime(ilarkesto.core.time.DateAndTime dateAndTime) {
        if (isDateAndTime(dateAndTime)) return (Change)this;
        if (dateAndTime == null) throw new RuntimeException("Field is mandatory.");
        this.dateAndTime = dateAndTime ;
        propertyChanged("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
        return (Change)this;
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
            return "Change_dateAndTime";
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
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    // --- key ---

    private java.lang.String key ;

    public final java.lang.String getKey() {
        return this.key ;
    }

    public final Change setKey(java.lang.String key) {
        if (isKey(key)) return (Change)this;
        this.key = key ;
        propertyChanged("key", ilarkesto.core.persistance.Persistence.propertyAsString(this.key));
        return (Change)this;
    }

    public final boolean isKey(java.lang.String key) {
        return ilarkesto.core.base.Utl.equals(this.key, key);
    }

    private transient KeyModel keyModel;

    public KeyModel getKeyModel() {
        if (keyModel == null) keyModel = createKeyModel();
        return keyModel;
    }

    protected KeyModel createKeyModel() { return new KeyModel(); }

    protected class KeyModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Change_key";
        }

        @Override
        public java.lang.String getValue() {
            return getKey();
        }

        @Override
        public void setValue(java.lang.String value) {
            setKey(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- oldValue ---

    private java.lang.String oldValue ;

    public final java.lang.String getOldValue() {
        return this.oldValue ;
    }

    public final Change setOldValue(java.lang.String oldValue) {
        if (isOldValue(oldValue)) return (Change)this;
        this.oldValue = oldValue ;
        propertyChanged("oldValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.oldValue));
        return (Change)this;
    }

    public final boolean isOldValue(java.lang.String oldValue) {
        return ilarkesto.core.base.Utl.equals(this.oldValue, oldValue);
    }

    private transient OldValueModel oldValueModel;

    public OldValueModel getOldValueModel() {
        if (oldValueModel == null) oldValueModel = createOldValueModel();
        return oldValueModel;
    }

    protected OldValueModel createOldValueModel() { return new OldValueModel(); }

    protected class OldValueModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Change_oldValue";
        }

        @Override
        public java.lang.String getValue() {
            return getOldValue();
        }

        @Override
        public void setValue(java.lang.String value) {
            setOldValue(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- newValue ---

    private java.lang.String newValue ;

    public final java.lang.String getNewValue() {
        return this.newValue ;
    }

    public final Change setNewValue(java.lang.String newValue) {
        if (isNewValue(newValue)) return (Change)this;
        this.newValue = newValue ;
        propertyChanged("newValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.newValue));
        return (Change)this;
    }

    public final boolean isNewValue(java.lang.String newValue) {
        return ilarkesto.core.base.Utl.equals(this.newValue, newValue);
    }

    private transient NewValueModel newValueModel;

    public NewValueModel getNewValueModel() {
        if (newValueModel == null) newValueModel = createNewValueModel();
        return newValueModel;
    }

    protected NewValueModel createNewValueModel() { return new NewValueModel(); }

    protected class NewValueModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Change_newValue";
        }

        @Override
        public java.lang.String getValue() {
            return getNewValue();
        }

        @Override
        public void setValue(java.lang.String value) {
            setNewValue(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- comment ---

    private java.lang.String comment ;

    public final java.lang.String getComment() {
        return this.comment ;
    }

    public final Change setComment(java.lang.String comment) {
        if (isComment(comment)) return (Change)this;
        this.comment = comment ;
        propertyChanged("comment", ilarkesto.core.persistance.Persistence.propertyAsString(this.comment));
        return (Change)this;
    }

    public final boolean isComment(java.lang.String comment) {
        return ilarkesto.core.base.Utl.equals(this.comment, comment);
    }

    private transient CommentModel commentModel;

    public CommentModel getCommentModel() {
        if (commentModel == null) commentModel = createCommentModel();
        return commentModel;
    }

    protected CommentModel createCommentModel() { return new CommentModel(); }

    protected class CommentModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "Change_comment";
        }

        @Override
        public java.lang.String getValue() {
            return getComment();
        }

        @Override
        public void setValue(java.lang.String value) {
            setComment(value);
        }

        @Override
        public boolean isRichtext() { return true; }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
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
            if (property.equals("parentId")) parentId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("userId")) userId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("dateAndTime")) dateAndTime = ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value);
            if (property.equals("key")) key = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("oldValue")) oldValue = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("newValue")) newValue = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("comment")) comment = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
        }
        updateLastModified();
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("parentId", ilarkesto.core.persistance.Persistence.propertyAsString(this.parentId));
        properties.put("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        properties.put("dateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.dateAndTime));
        properties.put("key", ilarkesto.core.persistance.Persistence.propertyAsString(this.key));
        properties.put("oldValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.oldValue));
        properties.put("newValue", ilarkesto.core.persistance.Persistence.propertyAsString(this.newValue));
        properties.put("comment", ilarkesto.core.persistance.Persistence.propertyAsString(this.comment));
    }

}