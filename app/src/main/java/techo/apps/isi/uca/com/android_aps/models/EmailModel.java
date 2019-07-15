package techo.apps.isi.uca.com.android_aps.models;

import io.realm.RealmObject;

/**
 * Created by macyarin on 10/4/18.
 */

public class EmailModel extends RealmObject {
    private String Address;
    private String tag;
    private int Owner;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getOwner() {
        return Owner;
    }

    public void setOwner(int owner) {
        Owner = owner;
    }
}
