// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.legacy.generator.GwtEntityGenerator










package scrum.client.admin;

import java.util.*;
import ilarkesto.core.base.Utl;
import ilarkesto.core.logging.Log;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GProjectUserConfig
            extends scrum.client.common.AScrumGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    @Override
    protected void doPersist() {
        getDao().createProjectUserConfig((ProjectUserConfig)this);
    }

    @Override
    public void delete() {
        getDao().deleteProjectUserConfig((ProjectUserConfig)this);
    }

    public abstract boolean isMisconductsEditable();

    public GProjectUserConfig() {
    }

    public GProjectUserConfig(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "ProjectUserConfig";

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

    public final ProjectUserConfig setProject(scrum.client.project.Project project) {
        String id = project == null ? null : project.getId();
        if (ilarkesto.core.base.Utl.equals(this.projectId, id)) return (ProjectUserConfig) this;
        this.projectId = id;
        propertyChanged("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        return (ProjectUserConfig)this;
    }

    public final boolean isProject(scrum.client.project.Project project) {
        String id = project==null ? null : project.getId();
        return ilarkesto.core.base.Utl.equals(this.projectId, id);
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

    public final ProjectUserConfig setUser(scrum.client.admin.User user) {
        String id = user == null ? null : user.getId();
        if (ilarkesto.core.base.Utl.equals(this.userId, id)) return (ProjectUserConfig) this;
        this.userId = id;
        propertyChanged("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        return (ProjectUserConfig)this;
    }

    public final boolean isUser(scrum.client.admin.User user) {
        String id = user==null ? null : user.getId();
        return ilarkesto.core.base.Utl.equals(this.userId, id);
    }

    // --- color ---

    private java.lang.String color ;

    public final java.lang.String getColor() {
        return this.color ;
    }

    public final ProjectUserConfig setColor(java.lang.String color) {
        if (isColor(color)) return (ProjectUserConfig)this;
        this.color = color ;
        propertyChanged("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
        return (ProjectUserConfig)this;
    }

    public final boolean isColor(java.lang.String color) {
        return ilarkesto.core.base.Utl.equals(this.color, color);
    }

    private transient ColorModel colorModel;

    public ColorModel getColorModel() {
        if (colorModel == null) colorModel = createColorModel();
        return colorModel;
    }

    protected ColorModel createColorModel() { return new ColorModel(); }

    protected class ColorModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_color";
        }

        @Override
        public java.lang.String getValue() {
            return getColor();
        }

        @Override
        public void setValue(java.lang.String value) {
            setColor(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- receiveEmailsOnProjectEvents ---

    private boolean receiveEmailsOnProjectEvents ;

    public final boolean isReceiveEmailsOnProjectEvents() {
        return this.receiveEmailsOnProjectEvents ;
    }

    public final ProjectUserConfig setReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        if (isReceiveEmailsOnProjectEvents(receiveEmailsOnProjectEvents)) return (ProjectUserConfig)this;
        this.receiveEmailsOnProjectEvents = receiveEmailsOnProjectEvents ;
        propertyChanged("receiveEmailsOnProjectEvents", ilarkesto.core.persistance.Persistence.propertyAsString(this.receiveEmailsOnProjectEvents));
        return (ProjectUserConfig)this;
    }

    public final boolean isReceiveEmailsOnProjectEvents(boolean receiveEmailsOnProjectEvents) {
        return ilarkesto.core.base.Utl.equals(this.receiveEmailsOnProjectEvents, receiveEmailsOnProjectEvents);
    }

    private transient ReceiveEmailsOnProjectEventsModel receiveEmailsOnProjectEventsModel;

    public ReceiveEmailsOnProjectEventsModel getReceiveEmailsOnProjectEventsModel() {
        if (receiveEmailsOnProjectEventsModel == null) receiveEmailsOnProjectEventsModel = createReceiveEmailsOnProjectEventsModel();
        return receiveEmailsOnProjectEventsModel;
    }

    protected ReceiveEmailsOnProjectEventsModel createReceiveEmailsOnProjectEventsModel() { return new ReceiveEmailsOnProjectEventsModel(); }

    protected class ReceiveEmailsOnProjectEventsModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_receiveEmailsOnProjectEvents";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isReceiveEmailsOnProjectEvents();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setReceiveEmailsOnProjectEvents(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    // --- misconducts ---

    private int misconducts ;

    public final int getMisconducts() {
        return this.misconducts ;
    }

    public final ProjectUserConfig setMisconducts(int misconducts) {
        if (isMisconducts(misconducts)) return (ProjectUserConfig)this;
        this.misconducts = misconducts ;
        propertyChanged("misconducts", ilarkesto.core.persistance.Persistence.propertyAsString(this.misconducts));
        return (ProjectUserConfig)this;
    }

    public final boolean isMisconducts(int misconducts) {
        return ilarkesto.core.base.Utl.equals(this.misconducts, misconducts);
    }

    private transient MisconductsModel misconductsModel;

    public MisconductsModel getMisconductsModel() {
        if (misconductsModel == null) misconductsModel = createMisconductsModel();
        return misconductsModel;
    }

    protected MisconductsModel createMisconductsModel() { return new MisconductsModel(); }

    protected class MisconductsModel extends ilarkesto.gwt.client.editor.AIntegerEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_misconducts";
        }

        @Override
        public java.lang.Integer getValue() {
            return getMisconducts();
        }

        @Override
        public void setValue(java.lang.Integer value) {
            setMisconducts(value);
        }

            @Override
            public void increment() {
                setMisconducts(getMisconducts() + 1);
            }

            @Override
            public void decrement() {
                setMisconducts(getMisconducts() - 1);
            }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        public boolean isEditable() { return GProjectUserConfig.this.isMisconductsEditable(); }

        @Override
        protected void onChangeValue(java.lang.Integer oldValue, java.lang.Integer newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    // --- richtextAutosaveText ---

    private java.lang.String richtextAutosaveText ;

    public final java.lang.String getRichtextAutosaveText() {
        return this.richtextAutosaveText ;
    }

    public final ProjectUserConfig setRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        if (isRichtextAutosaveText(richtextAutosaveText)) return (ProjectUserConfig)this;
        this.richtextAutosaveText = richtextAutosaveText ;
        propertyChanged("richtextAutosaveText", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveText));
        return (ProjectUserConfig)this;
    }

    public final boolean isRichtextAutosaveText(java.lang.String richtextAutosaveText) {
        return ilarkesto.core.base.Utl.equals(this.richtextAutosaveText, richtextAutosaveText);
    }

    private transient RichtextAutosaveTextModel richtextAutosaveTextModel;

    public RichtextAutosaveTextModel getRichtextAutosaveTextModel() {
        if (richtextAutosaveTextModel == null) richtextAutosaveTextModel = createRichtextAutosaveTextModel();
        return richtextAutosaveTextModel;
    }

    protected RichtextAutosaveTextModel createRichtextAutosaveTextModel() { return new RichtextAutosaveTextModel(); }

    protected class RichtextAutosaveTextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_richtextAutosaveText";
        }

        @Override
        public java.lang.String getValue() {
            return getRichtextAutosaveText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setRichtextAutosaveText(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- richtextAutosaveField ---

    private java.lang.String richtextAutosaveField ;

    public final java.lang.String getRichtextAutosaveField() {
        return this.richtextAutosaveField ;
    }

    public final ProjectUserConfig setRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        if (isRichtextAutosaveField(richtextAutosaveField)) return (ProjectUserConfig)this;
        this.richtextAutosaveField = richtextAutosaveField ;
        propertyChanged("richtextAutosaveField", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveField));
        return (ProjectUserConfig)this;
    }

    public final boolean isRichtextAutosaveField(java.lang.String richtextAutosaveField) {
        return ilarkesto.core.base.Utl.equals(this.richtextAutosaveField, richtextAutosaveField);
    }

    private transient RichtextAutosaveFieldModel richtextAutosaveFieldModel;

    public RichtextAutosaveFieldModel getRichtextAutosaveFieldModel() {
        if (richtextAutosaveFieldModel == null) richtextAutosaveFieldModel = createRichtextAutosaveFieldModel();
        return richtextAutosaveFieldModel;
    }

    protected RichtextAutosaveFieldModel createRichtextAutosaveFieldModel() { return new RichtextAutosaveFieldModel(); }

    protected class RichtextAutosaveFieldModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_richtextAutosaveField";
        }

        @Override
        public java.lang.String getValue() {
            return getRichtextAutosaveField();
        }

        @Override
        public void setValue(java.lang.String value) {
            setRichtextAutosaveField(value);
        }

        @Override
        protected void onChangeValue(java.lang.String oldValue, java.lang.String newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- selectedEntitysIds ---

    private java.util.List<java.lang.String> selectedEntitysIds = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getSelectedEntitysIds() {
        return new java.util.ArrayList<java.lang.String>(selectedEntitysIds);
    }

    public final void setSelectedEntitysIds(java.util.List<java.lang.String> selectedEntitysIds) {
        if (selectedEntitysIds == null) throw new IllegalArgumentException("null is not allowed");
        if (this.selectedEntitysIds.equals(selectedEntitysIds)) return;
        this.selectedEntitysIds = new java.util.ArrayList<java.lang.String>(selectedEntitysIds);
        propertyChanged("selectedEntitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.selectedEntitysIds));
    }

    public final boolean containsSelectedEntitysId(java.lang.String selectedEntitysId) {
        return selectedEntitysIds.contains(selectedEntitysId);
    }


    // --- online ---

    private boolean online ;

    public final boolean isOnline() {
        return this.online ;
    }

    public final ProjectUserConfig setOnline(boolean online) {
        if (isOnline(online)) return (ProjectUserConfig)this;
        this.online = online ;
        propertyChanged("online", ilarkesto.core.persistance.Persistence.propertyAsString(this.online));
        return (ProjectUserConfig)this;
    }

    public final boolean isOnline(boolean online) {
        return ilarkesto.core.base.Utl.equals(this.online, online);
    }

    private transient OnlineModel onlineModel;

    public OnlineModel getOnlineModel() {
        if (onlineModel == null) onlineModel = createOnlineModel();
        return onlineModel;
    }

    protected OnlineModel createOnlineModel() { return new OnlineModel(); }

    protected class OnlineModel extends ilarkesto.gwt.client.editor.ABooleanEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_online";
        }

        @Override
        public java.lang.Boolean getValue() {
            return isOnline();
        }

        @Override
        public void setValue(java.lang.Boolean value) {
            setOnline(value);
        }

        @Override
        public boolean isMandatory() { return true; }

        @Override
        protected void onChangeValue(java.lang.Boolean oldValue, java.lang.Boolean newValue) {
            super.onChangeValue(oldValue, newValue);
            if (oldValue == null) return;
            addUndo(this, oldValue);
        }

    }

    // --- lastActivityDateAndTime ---

    private ilarkesto.core.time.DateAndTime lastActivityDateAndTime ;

    public final ilarkesto.core.time.DateAndTime getLastActivityDateAndTime() {
        return this.lastActivityDateAndTime ;
    }

    public final ProjectUserConfig setLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        if (isLastActivityDateAndTime(lastActivityDateAndTime)) return (ProjectUserConfig)this;
        this.lastActivityDateAndTime = lastActivityDateAndTime ;
        propertyChanged("lastActivityDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastActivityDateAndTime));
        return (ProjectUserConfig)this;
    }

    public final boolean isLastActivityDateAndTime(ilarkesto.core.time.DateAndTime lastActivityDateAndTime) {
        return ilarkesto.core.base.Utl.equals(this.lastActivityDateAndTime, lastActivityDateAndTime);
    }

    private transient LastActivityDateAndTimeModel lastActivityDateAndTimeModel;

    public LastActivityDateAndTimeModel getLastActivityDateAndTimeModel() {
        if (lastActivityDateAndTimeModel == null) lastActivityDateAndTimeModel = createLastActivityDateAndTimeModel();
        return lastActivityDateAndTimeModel;
    }

    protected LastActivityDateAndTimeModel createLastActivityDateAndTimeModel() { return new LastActivityDateAndTimeModel(); }

    protected class LastActivityDateAndTimeModel extends ilarkesto.gwt.client.editor.ADateAndTimeEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_lastActivityDateAndTime";
        }

        @Override
        public ilarkesto.core.time.DateAndTime getValue() {
            return getLastActivityDateAndTime();
        }

        @Override
        public void setValue(ilarkesto.core.time.DateAndTime value) {
            setLastActivityDateAndTime(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.DateAndTime oldValue, ilarkesto.core.time.DateAndTime newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- pblFilterThemes ---

    private java.util.List<java.lang.String> pblFilterThemes = new java.util.ArrayList<java.lang.String>();

    public final java.util.List<java.lang.String> getPblFilterThemes() {
        return new java.util.ArrayList<java.lang.String>(pblFilterThemes);
    }

    public final void setPblFilterThemes(java.util.List<java.lang.String> pblFilterThemes) {
        if (pblFilterThemes == null) throw new IllegalArgumentException("null is not allowed");
        if (this.pblFilterThemes.equals(pblFilterThemes)) return;
        this.pblFilterThemes = new java.util.ArrayList<java.lang.String>(pblFilterThemes);
        propertyChanged("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
    }

    public final boolean containsPblFilterTheme(java.lang.String pblFilterTheme) {
        return pblFilterThemes.contains(pblFilterTheme);
    }


    // --- pblFilterQualitys ---

    private Set<String> pblFilterQualitysIds = new HashSet<String>();

    public final java.util.Set<scrum.client.project.Quality> getPblFilterQualitys() {
        if ( pblFilterQualitysIds.isEmpty()) return Collections.emptySet();
        return getDao().getQualitys(this.pblFilterQualitysIds);
    }

    public final void setPblFilterQualitys(Collection<scrum.client.project.Quality> values) {
        pblFilterQualitysIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
    }

    public final void addPblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
        String id = pblFilterQuality.getId();
        if (pblFilterQualitysIds.contains(id)) return;
        pblFilterQualitysIds.add(id);
        propertyChanged("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
    }

    public final void removePblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
        String id = pblFilterQuality.getId();
        if (!pblFilterQualitysIds.contains(id)) return;
        pblFilterQualitysIds.remove(id);
        propertyChanged("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
    }

    public final boolean containsPblFilterQuality(scrum.client.project.Quality pblFilterQuality) {
        return pblFilterQualitysIds.contains(pblFilterQuality.getId());
    }


    // --- pblFilterDateFrom ---

    private ilarkesto.core.time.Date pblFilterDateFrom ;

    public final ilarkesto.core.time.Date getPblFilterDateFrom() {
        return this.pblFilterDateFrom ;
    }

    public final ProjectUserConfig setPblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        if (isPblFilterDateFrom(pblFilterDateFrom)) return (ProjectUserConfig)this;
        this.pblFilterDateFrom = pblFilterDateFrom ;
        propertyChanged("pblFilterDateFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateFrom));
        return (ProjectUserConfig)this;
    }

    public final boolean isPblFilterDateFrom(ilarkesto.core.time.Date pblFilterDateFrom) {
        return ilarkesto.core.base.Utl.equals(this.pblFilterDateFrom, pblFilterDateFrom);
    }

    private transient PblFilterDateFromModel pblFilterDateFromModel;

    public PblFilterDateFromModel getPblFilterDateFromModel() {
        if (pblFilterDateFromModel == null) pblFilterDateFromModel = createPblFilterDateFromModel();
        return pblFilterDateFromModel;
    }

    protected PblFilterDateFromModel createPblFilterDateFromModel() { return new PblFilterDateFromModel(); }

    protected class PblFilterDateFromModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterDateFrom";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getPblFilterDateFrom();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setPblFilterDateFrom(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- pblFilterDateTo ---

    private ilarkesto.core.time.Date pblFilterDateTo ;

    public final ilarkesto.core.time.Date getPblFilterDateTo() {
        return this.pblFilterDateTo ;
    }

    public final ProjectUserConfig setPblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        if (isPblFilterDateTo(pblFilterDateTo)) return (ProjectUserConfig)this;
        this.pblFilterDateTo = pblFilterDateTo ;
        propertyChanged("pblFilterDateTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateTo));
        return (ProjectUserConfig)this;
    }

    public final boolean isPblFilterDateTo(ilarkesto.core.time.Date pblFilterDateTo) {
        return ilarkesto.core.base.Utl.equals(this.pblFilterDateTo, pblFilterDateTo);
    }

    private transient PblFilterDateToModel pblFilterDateToModel;

    public PblFilterDateToModel getPblFilterDateToModel() {
        if (pblFilterDateToModel == null) pblFilterDateToModel = createPblFilterDateToModel();
        return pblFilterDateToModel;
    }

    protected PblFilterDateToModel createPblFilterDateToModel() { return new PblFilterDateToModel(); }

    protected class PblFilterDateToModel extends ilarkesto.gwt.client.editor.ADateEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterDateTo";
        }

        @Override
        public ilarkesto.core.time.Date getValue() {
            return getPblFilterDateTo();
        }

        @Override
        public void setValue(ilarkesto.core.time.Date value) {
            setPblFilterDateTo(value);
        }

        @Override
        protected void onChangeValue(ilarkesto.core.time.Date oldValue, ilarkesto.core.time.Date newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- pblFilterEstimationFrom ---

    private java.lang.Float pblFilterEstimationFrom ;

    public final java.lang.Float getPblFilterEstimationFrom() {
        return this.pblFilterEstimationFrom ;
    }

    public final ProjectUserConfig setPblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        if (isPblFilterEstimationFrom(pblFilterEstimationFrom)) return (ProjectUserConfig)this;
        this.pblFilterEstimationFrom = pblFilterEstimationFrom ;
        propertyChanged("pblFilterEstimationFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationFrom));
        return (ProjectUserConfig)this;
    }

    public final boolean isPblFilterEstimationFrom(java.lang.Float pblFilterEstimationFrom) {
        return ilarkesto.core.base.Utl.equals(this.pblFilterEstimationFrom, pblFilterEstimationFrom);
    }

    private transient PblFilterEstimationFromModel pblFilterEstimationFromModel;

    public PblFilterEstimationFromModel getPblFilterEstimationFromModel() {
        if (pblFilterEstimationFromModel == null) pblFilterEstimationFromModel = createPblFilterEstimationFromModel();
        return pblFilterEstimationFromModel;
    }

    protected PblFilterEstimationFromModel createPblFilterEstimationFromModel() { return new PblFilterEstimationFromModel(); }

    protected class PblFilterEstimationFromModel extends ilarkesto.gwt.client.editor.AFloatEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterEstimationFrom";
        }

        @Override
        public java.lang.Float getValue() {
            return getPblFilterEstimationFrom();
        }

        @Override
        public void setValue(java.lang.Float value) {
            setPblFilterEstimationFrom(value);
        }

        @Override
        protected void onChangeValue(java.lang.Float oldValue, java.lang.Float newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- pblFilterEstimationTo ---

    private java.lang.Float pblFilterEstimationTo ;

    public final java.lang.Float getPblFilterEstimationTo() {
        return this.pblFilterEstimationTo ;
    }

    public final ProjectUserConfig setPblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        if (isPblFilterEstimationTo(pblFilterEstimationTo)) return (ProjectUserConfig)this;
        this.pblFilterEstimationTo = pblFilterEstimationTo ;
        propertyChanged("pblFilterEstimationTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationTo));
        return (ProjectUserConfig)this;
    }

    public final boolean isPblFilterEstimationTo(java.lang.Float pblFilterEstimationTo) {
        return ilarkesto.core.base.Utl.equals(this.pblFilterEstimationTo, pblFilterEstimationTo);
    }

    private transient PblFilterEstimationToModel pblFilterEstimationToModel;

    public PblFilterEstimationToModel getPblFilterEstimationToModel() {
        if (pblFilterEstimationToModel == null) pblFilterEstimationToModel = createPblFilterEstimationToModel();
        return pblFilterEstimationToModel;
    }

    protected PblFilterEstimationToModel createPblFilterEstimationToModel() { return new PblFilterEstimationToModel(); }

    protected class PblFilterEstimationToModel extends ilarkesto.gwt.client.editor.AFloatEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterEstimationTo";
        }

        @Override
        public java.lang.Float getValue() {
            return getPblFilterEstimationTo();
        }

        @Override
        public void setValue(java.lang.Float value) {
            setPblFilterEstimationTo(value);
        }

        @Override
        protected void onChangeValue(java.lang.Float oldValue, java.lang.Float newValue) {
            super.onChangeValue(oldValue, newValue);
            addUndo(this, oldValue);
        }

    }

    // --- pblFilterText ---

    private java.lang.String pblFilterText ;

    public final java.lang.String getPblFilterText() {
        return this.pblFilterText ;
    }

    public final ProjectUserConfig setPblFilterText(java.lang.String pblFilterText) {
        if (isPblFilterText(pblFilterText)) return (ProjectUserConfig)this;
        this.pblFilterText = pblFilterText ;
        propertyChanged("pblFilterText", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterText));
        return (ProjectUserConfig)this;
    }

    public final boolean isPblFilterText(java.lang.String pblFilterText) {
        return ilarkesto.core.base.Utl.equals(this.pblFilterText, pblFilterText);
    }

    private transient PblFilterTextModel pblFilterTextModel;

    public PblFilterTextModel getPblFilterTextModel() {
        if (pblFilterTextModel == null) pblFilterTextModel = createPblFilterTextModel();
        return pblFilterTextModel;
    }

    protected PblFilterTextModel createPblFilterTextModel() { return new PblFilterTextModel(); }

    protected class PblFilterTextModel extends ilarkesto.gwt.client.editor.ATextEditorModel {

        @Override
        public String getId() {
            return "ProjectUserConfig_pblFilterText";
        }

        @Override
        public java.lang.String getValue() {
            return getPblFilterText();
        }

        @Override
        public void setValue(java.lang.String value) {
            setPblFilterText(value);
        }

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
            if (property.equals("projectId")) projectId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("userId")) userId = ilarkesto.core.persistance.Persistence.parsePropertyReference(value);
            if (property.equals("color")) color = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("receiveEmailsOnProjectEvents")) receiveEmailsOnProjectEvents = ilarkesto.core.persistance.Persistence.parsePropertyboolean(value);
            if (property.equals("misconducts")) misconducts = ilarkesto.core.persistance.Persistence.parsePropertyint(value);
            if (property.equals("richtextAutosaveText")) richtextAutosaveText = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("richtextAutosaveField")) richtextAutosaveField = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
            if (property.equals("selectedEntitysIds")) selectedEntitysIds = ilarkesto.core.persistance.Persistence.parsePropertyStringList(value);
            if (property.equals("online")) online = ilarkesto.core.persistance.Persistence.parsePropertyboolean(value);
            if (property.equals("lastActivityDateAndTime")) lastActivityDateAndTime = ilarkesto.core.persistance.Persistence.parsePropertyDateAndTime(value);
            if (property.equals("pblFilterThemes")) pblFilterThemes = ilarkesto.core.persistance.Persistence.parsePropertyStringList(value);
            if (property.equals("pblFilterQualitysIds")) pblFilterQualitysIds = ilarkesto.core.persistance.Persistence.parsePropertyReferenceSet(value);
            if (property.equals("pblFilterDateFrom")) pblFilterDateFrom = ilarkesto.core.persistance.Persistence.parsePropertyDate(value);
            if (property.equals("pblFilterDateTo")) pblFilterDateTo = ilarkesto.core.persistance.Persistence.parsePropertyDate(value);
            if (property.equals("pblFilterEstimationFrom")) pblFilterEstimationFrom = ilarkesto.core.persistance.Persistence.parsePropertyFloat(value);
            if (property.equals("pblFilterEstimationTo")) pblFilterEstimationTo = ilarkesto.core.persistance.Persistence.parsePropertyFloat(value);
            if (property.equals("pblFilterText")) pblFilterText = ilarkesto.core.persistance.Persistence.parsePropertyString(value);
        }
        updateLastModified();
    }

    @Override
    public void storeProperties(Map<String, String> properties) {
        super.storeProperties(properties);
        properties.put("projectId", ilarkesto.core.persistance.Persistence.propertyAsString(this.projectId));
        properties.put("userId", ilarkesto.core.persistance.Persistence.propertyAsString(this.userId));
        properties.put("color", ilarkesto.core.persistance.Persistence.propertyAsString(this.color));
        properties.put("receiveEmailsOnProjectEvents", ilarkesto.core.persistance.Persistence.propertyAsString(this.receiveEmailsOnProjectEvents));
        properties.put("misconducts", ilarkesto.core.persistance.Persistence.propertyAsString(this.misconducts));
        properties.put("richtextAutosaveText", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveText));
        properties.put("richtextAutosaveField", ilarkesto.core.persistance.Persistence.propertyAsString(this.richtextAutosaveField));
        properties.put("selectedEntitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.selectedEntitysIds));
        properties.put("online", ilarkesto.core.persistance.Persistence.propertyAsString(this.online));
        properties.put("lastActivityDateAndTime", ilarkesto.core.persistance.Persistence.propertyAsString(this.lastActivityDateAndTime));
        properties.put("pblFilterThemes", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterThemes));
        properties.put("pblFilterQualitysIds", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterQualitysIds));
        properties.put("pblFilterDateFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateFrom));
        properties.put("pblFilterDateTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterDateTo));
        properties.put("pblFilterEstimationFrom", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationFrom));
        properties.put("pblFilterEstimationTo", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterEstimationTo));
        properties.put("pblFilterText", ilarkesto.core.persistance.Persistence.propertyAsString(this.pblFilterText));
    }

}