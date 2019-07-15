package techo.apps.isi.uca.com.android_aps.models;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by macyarin on 2/4/18.
 */

public class ExperienceModel extends RealmObject{
    private int id;
    private RealmList<AchievementModel> achievements = new RealmList<>();
    private String date;
    private int approved;
    private ExperienceTypeModel name;
    private String description;
    private RealmList<OrganizationModel> organizations = new RealmList<>();
    private RealmList<InterestGroupModel> interestGroups = new RealmList<>();
    private GroupRoleModel groupRole;
    private RealmList<SportModel> sport = new RealmList<>();
    private RealmList<CultureModel> culture = new RealmList<>();
    private StudentJobModel studentJob;
    private RealmList<UniversityModel> university;
    private String proyectTitle;
    private RealmList<PersonModel> contacts = new RealmList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RealmList<AchievementModel> getAchievements() {
        return achievements;
    }

    public void setAchievements(RealmList<AchievementModel> achievements) {
        this.achievements = achievements;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    public ExperienceTypeModel getName() {
        return name;
    }

    public void setName(ExperienceTypeModel name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RealmList<OrganizationModel> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(RealmList<OrganizationModel> organizations) {
        this.organizations = organizations;
    }

    public RealmList<InterestGroupModel> getInterestGroups() {
        return interestGroups;
    }

    public void setInterestGroups(RealmList<InterestGroupModel> interestGroups) {
        this.interestGroups = interestGroups;
    }

    public GroupRoleModel getGroupRole() {
        return groupRole;
    }

    public void setGroupRole(GroupRoleModel groupRole) {
        this.groupRole = groupRole;
    }

    public RealmList<SportModel> getSport() {
        return sport;
    }

    public void setSport(RealmList<SportModel> sport) {
        this.sport = sport;
    }

    public RealmList<CultureModel> getCulture() {
        return culture;
    }

    public void setCulture(RealmList<CultureModel> culture) {
        this.culture = culture;
    }

    public StudentJobModel getStudentJob() {
        return studentJob;
    }

    public void setStudentJob(StudentJobModel studentJob) {
        this.studentJob = studentJob;
    }

    public RealmList<UniversityModel> getUniversity() {
        return university;
    }

    public void setUniversity(RealmList<UniversityModel> university) {
        this.university = university;
    }

    public String getProyectTitle() {
        return proyectTitle;
    }

    public void setProyectTitle(String proyectTitle) {
        this.proyectTitle = proyectTitle;
    }

    public RealmList<PersonModel> getContacts() {
        return contacts;
    }

    public void setContacts(RealmList<PersonModel> contacts) {
        this.contacts = contacts;
    }
}

