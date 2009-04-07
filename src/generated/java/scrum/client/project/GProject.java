// ----------> GENERATED FILE - DON'T TOUCH! <----------

// generator: ilarkesto.mda.gen.GwtEntityGenerator










package scrum.client.project;

import java.util.*;
import ilarkesto.persistence.*;
import ilarkesto.logging.*;
import ilarkesto.base.*;
import ilarkesto.base.time.*;
import ilarkesto.auth.*;
import scrum.client.common.*;
import ilarkesto.gwt.client.*;

public abstract class GProject
            extends ilarkesto.gwt.client.AGwtEntity {

    protected scrum.client.Dao getDao() {
        return scrum.client.Dao.get();
    }

    public GProject() {
    }

    public GProject(Map data) {
        super(data);
        updateProperties(data);
    }

    public static final String ENTITY_TYPE = "project";

    @Override
    public final String getEntityType() {
        return ENTITY_TYPE;
    }

    // --- label ---

    private java.lang.String label ;

    public final java.lang.String getLabel() {
        return this.label ;
    }

    public final Project setLabel(java.lang.String label) {
        this.label = label ;
        propertyChanged("label", this.label);
        return (Project)this;
    }

    public final boolean isLabel(java.lang.String label) {
        return equals(this.label, label);
    }

    // --- description ---

    private java.lang.String description ;

    public final java.lang.String getDescription() {
        return this.description ;
    }

    public final Project setDescription(java.lang.String description) {
        this.description = description ;
        propertyChanged("description", this.description);
        return (Project)this;
    }

    public final boolean isDescription(java.lang.String description) {
        return equals(this.description, description);
    }

    // --- begin ---

    private ilarkesto.gwt.client.Date begin ;

    public final ilarkesto.gwt.client.Date getBegin() {
        return this.begin ;
    }

    public final Project setBegin(ilarkesto.gwt.client.Date begin) {
        this.begin = begin ;
        propertyChanged("begin", this.begin);
        return (Project)this;
    }

    public final boolean isBegin(ilarkesto.gwt.client.Date begin) {
        return equals(this.begin, begin);
    }

    // --- end ---

    private ilarkesto.gwt.client.Date end ;

    public final ilarkesto.gwt.client.Date getEnd() {
        return this.end ;
    }

    public final Project setEnd(ilarkesto.gwt.client.Date end) {
        this.end = end ;
        propertyChanged("end", this.end);
        return (Project)this;
    }

    public final boolean isEnd(ilarkesto.gwt.client.Date end) {
        return equals(this.end, end);
    }

    // --- participants ---

    private Set<String> participantsIds = new HashSet<String>();

    public final java.util.Set<scrum.client.admin.User> getParticipants() {
        if ( participantsIds.isEmpty()) return Collections.emptySet();
        return getDao().getUsers(this.participantsIds);
    }

    public final void setParticipants(Collection<scrum.client.admin.User> values) {
        participantsIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("participants", this.participantsIds);
    }

    public final void addParticipant(scrum.client.admin.User participant) {
        String id = participant.getId();
        if (participantsIds.contains(id)) return;
        participantsIds.add(id);
        propertyChanged("participants", this.participantsIds);
    }

    public final void removeParticipant(scrum.client.admin.User participant) {
        String id = participant.getId();
        if (!participantsIds.contains(id)) return;
        participantsIds.remove(id);
        propertyChanged("participants", this.participantsIds);
    }

    // --- admins ---

    private Set<String> adminsIds = new HashSet<String>();

    public final java.util.Set<scrum.client.admin.User> getAdmins() {
        if ( adminsIds.isEmpty()) return Collections.emptySet();
        return getDao().getUsers(this.adminsIds);
    }

    public final void setAdmins(Collection<scrum.client.admin.User> values) {
        adminsIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("admins", this.adminsIds);
    }

    public final void addAdmin(scrum.client.admin.User admin) {
        String id = admin.getId();
        if (adminsIds.contains(id)) return;
        adminsIds.add(id);
        propertyChanged("admins", this.adminsIds);
    }

    public final void removeAdmin(scrum.client.admin.User admin) {
        String id = admin.getId();
        if (!adminsIds.contains(id)) return;
        adminsIds.remove(id);
        propertyChanged("admins", this.adminsIds);
    }

    // --- productOwners ---

    private Set<String> productOwnersIds = new HashSet<String>();

    public final java.util.Set<scrum.client.admin.User> getProductOwners() {
        if ( productOwnersIds.isEmpty()) return Collections.emptySet();
        return getDao().getUsers(this.productOwnersIds);
    }

    public final void setProductOwners(Collection<scrum.client.admin.User> values) {
        productOwnersIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("productOwners", this.productOwnersIds);
    }

    public final void addProductOwner(scrum.client.admin.User productOwner) {
        String id = productOwner.getId();
        if (productOwnersIds.contains(id)) return;
        productOwnersIds.add(id);
        propertyChanged("productOwners", this.productOwnersIds);
    }

    public final void removeProductOwner(scrum.client.admin.User productOwner) {
        String id = productOwner.getId();
        if (!productOwnersIds.contains(id)) return;
        productOwnersIds.remove(id);
        propertyChanged("productOwners", this.productOwnersIds);
    }

    // --- scrumMasters ---

    private Set<String> scrumMastersIds = new HashSet<String>();

    public final java.util.Set<scrum.client.admin.User> getScrumMasters() {
        if ( scrumMastersIds.isEmpty()) return Collections.emptySet();
        return getDao().getUsers(this.scrumMastersIds);
    }

    public final void setScrumMasters(Collection<scrum.client.admin.User> values) {
        scrumMastersIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("scrumMasters", this.scrumMastersIds);
    }

    public final void addScrumMaster(scrum.client.admin.User scrumMaster) {
        String id = scrumMaster.getId();
        if (scrumMastersIds.contains(id)) return;
        scrumMastersIds.add(id);
        propertyChanged("scrumMasters", this.scrumMastersIds);
    }

    public final void removeScrumMaster(scrum.client.admin.User scrumMaster) {
        String id = scrumMaster.getId();
        if (!scrumMastersIds.contains(id)) return;
        scrumMastersIds.remove(id);
        propertyChanged("scrumMasters", this.scrumMastersIds);
    }

    // --- teamMembers ---

    private Set<String> teamMembersIds = new HashSet<String>();

    public final java.util.Set<scrum.client.admin.User> getTeamMembers() {
        if ( teamMembersIds.isEmpty()) return Collections.emptySet();
        return getDao().getUsers(this.teamMembersIds);
    }

    public final void setTeamMembers(Collection<scrum.client.admin.User> values) {
        teamMembersIds = ilarkesto.gwt.client.Gwt.getIdsAsSet(values);
        propertyChanged("teamMembers", this.teamMembersIds);
    }

    public final void addTeamMember(scrum.client.admin.User teamMember) {
        String id = teamMember.getId();
        if (teamMembersIds.contains(id)) return;
        teamMembersIds.add(id);
        propertyChanged("teamMembers", this.teamMembersIds);
    }

    public final void removeTeamMember(scrum.client.admin.User teamMember) {
        String id = teamMember.getId();
        if (!teamMembersIds.contains(id)) return;
        teamMembersIds.remove(id);
        propertyChanged("teamMembers", this.teamMembersIds);
    }

    // --- currentSprint ---

    private String currentSprintId;

    public final scrum.client.sprint.Sprint getCurrentSprint() {
        if (currentSprintId == null) return null;
        return getDao().getSprint(this.currentSprintId);
    }

    public final Project setCurrentSprint(scrum.client.sprint.Sprint currentSprint) {
        String id = currentSprint == null ? null : currentSprint.getId();
        if (equals(this.currentSprintId, id)) return (Project) this;
        this.currentSprintId = id;
        propertyChanged("currentSprintId", this.currentSprintId);
        return (Project)this;
    }

    public final boolean isCurrentSprint(scrum.client.sprint.Sprint currentSprint) {
        return equals(this.currentSprintId, currentSprint);
    }

    // --- nextSprint ---

    private String nextSprintId;

    public final scrum.client.sprint.Sprint getNextSprint() {
        if (nextSprintId == null) return null;
        return getDao().getSprint(this.nextSprintId);
    }

    public final Project setNextSprint(scrum.client.sprint.Sprint nextSprint) {
        String id = nextSprint == null ? null : nextSprint.getId();
        if (equals(this.nextSprintId, id)) return (Project) this;
        this.nextSprintId = id;
        propertyChanged("nextSprintId", this.nextSprintId);
        return (Project)this;
    }

    public final boolean isNextSprint(scrum.client.sprint.Sprint nextSprint) {
        return equals(this.nextSprintId, nextSprint);
    }

    // --- update properties by map ---

    public void updateProperties(Map props) {
        label  = (java.lang.String) props.get("label");
        description  = (java.lang.String) props.get("description");
        String beginAsString = (String) props.get("begin");
        begin  =  beginAsString == null ? null : new ilarkesto.gwt.client.Date(beginAsString);
        String endAsString = (String) props.get("end");
        end  =  endAsString == null ? null : new ilarkesto.gwt.client.Date(endAsString);
        participantsIds = (Set<String>) props.get("participantsIds");
        adminsIds = (Set<String>) props.get("adminsIds");
        productOwnersIds = (Set<String>) props.get("productOwnersIds");
        scrumMastersIds = (Set<String>) props.get("scrumMastersIds");
        teamMembersIds = (Set<String>) props.get("teamMembersIds");
        currentSprintId = (String) props.get("currentSprintId");
        nextSprintId = (String) props.get("nextSprintId");
    }

    @Override
    public void storeProperties(Map properties) {
        super.storeProperties(properties);
        properties.put("label", this.label);
        properties.put("description", this.description);
        properties.put("begin", this.begin == null ? null : this.begin.toString());
        properties.put("end", this.end == null ? null : this.end.toString());
        properties.put("participants", this.participantsIds);
        properties.put("admins", this.adminsIds);
        properties.put("productOwners", this.productOwnersIds);
        properties.put("scrumMasters", this.scrumMastersIds);
        properties.put("teamMembers", this.teamMembersIds);
        properties.put("currentSprintId", this.currentSprintId);
        properties.put("nextSprintId", this.nextSprintId);
    }

}