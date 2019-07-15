package techo.apps.isi.uca.com.android_aps.models;

import java.util.ArrayList;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by Henry Hernandez on 04/05/2018.
 */

public class CultureModel extends RealmObject {
    private int ID;
    private String name;
    private int approved;
    private RealmList<CETypeModel> activities = new RealmList<>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    public RealmList<CETypeModel> getActivities() {
        return activities;
    }

    public void setActivities(RealmList<CETypeModel> activities) {
        this.activities = activities;
    }
}
