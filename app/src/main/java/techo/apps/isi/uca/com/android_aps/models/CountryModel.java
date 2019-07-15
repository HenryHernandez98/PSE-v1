package techo.apps.isi.uca.com.android_aps.models;

import io.realm.RealmObject;

/**
 * Created by macyarin on 3/4/18.
 */

public class CountryModel extends RealmObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
