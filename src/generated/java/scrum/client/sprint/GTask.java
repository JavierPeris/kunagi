// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.gen.GwtEntityGenerator










package scrum.client.sprint;

import java.util.*;
import ilarkesto.persistence.*;
import ilarkesto.logging.*;
import ilarkesto.base.*;
import ilarkesto.base.time.*;
import ilarkesto.auth.*;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GTask
            extends ilarkesto.gwt.client.AGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    public GTask() {
    }

    public GTask(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "task";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- requirement ---

    private String requirementId;

    public final scrum.client.project.Requirement getRequirement() {
        if (requirementId == null) return null;
        return getDao().getRequirement(this.requirementId);
    }

    public final Task setRequirement(scrum.client.project.Requirement requirement) {
        String id = requirement == null ? null : requirement.getId();
        if (equals(this.requirementId, id)) return (Task) this;
        this.requirementId = id;
        propertyChanged("requirementId", this.requirementId);
        return (Task)this;
    }

    public final boolean isRequirement(scrum.client.project.Requirement requirement) {
        return equals(this.requirementId, requirement);
    }

    // --- label ---

    private java.lang.String label ;

    public final java.lang.String getLabel() {
        return this.label ;
    }

    public final Task setLabel(java.lang.String label) {
        this.label = label ;
        propertyChanged("label", this.label);
        return (Task)this;
    }

    public final boolean isLabel(java.lang.String label) {
        return equals(this.label, label);
    }

    // --- remainingWork ---

    private int remainingWork ;

    public final int getRemainingWork() {
        return this.remainingWork ;
    }

    public final Task setRemainingWork(int remainingWork) {
        this.remainingWork = remainingWork ;
        propertyChanged("remainingWork", this.remainingWork);
        return (Task)this;
    }

    public final boolean isRemainingWork(int remainingWork) {
        return equals(this.remainingWork, remainingWork);
    }

    // --- burnedWork ---

    private int burnedWork ;

    public final int getBurnedWork() {
        return this.burnedWork ;
    }

    public final Task setBurnedWork(int burnedWork) {
        this.burnedWork = burnedWork ;
        propertyChanged("burnedWork", this.burnedWork);
        return (Task)this;
    }

    public final boolean isBurnedWork(int burnedWork) {
        return equals(this.burnedWork, burnedWork);
    }

    // --- notice ---

    private java.lang.String notice ;

    public final java.lang.String getNotice() {
        return this.notice ;
    }

    public final Task setNotice(java.lang.String notice) {
        this.notice = notice ;
        propertyChanged("notice", this.notice);
        return (Task)this;
    }

    public final boolean isNotice(java.lang.String notice) {
        return equals(this.notice, notice);
    }

    // --- owner ---

    private String ownerId;

    public final scrum.client.admin.User getOwner() {
        if (ownerId == null) return null;
        return getDao().getUser(this.ownerId);
    }

    public final Task setOwner(scrum.client.admin.User owner) {
        String id = owner == null ? null : owner.getId();
        if (equals(this.ownerId, id)) return (Task) this;
        this.ownerId = id;
        propertyChanged("ownerId", this.ownerId);
        return (Task)this;
    }

    public final boolean isOwner(scrum.client.admin.User owner) {
        return equals(this.ownerId, owner);
    }

    // --- update properties by map ---

    public void updateProperties(Map props) {
        requirementId = (String) props.get("requirementId");
        label  = (java.lang.String) props.get("label");
        remainingWork  = (Integer) props.get("remainingWork");
        burnedWork  = (Integer) props.get("burnedWork");
        notice  = (java.lang.String) props.get("notice");
        ownerId = (String) props.get("ownerId");
    }

    @Override
    public void storeProperties(Map properties) {
        super.storeProperties(properties);
        properties.put("requirementId", this.requirementId);
        properties.put("label", this.label);
        properties.put("remainingWork", this.remainingWork);
        properties.put("burnedWork", this.burnedWork);
        properties.put("notice", this.notice);
        properties.put("ownerId", this.ownerId);
    }

}