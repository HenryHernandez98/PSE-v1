package techo.apps.isi.uca.com.android_aps.models;

import io.realm.RealmObject;

/**
 * Created by macyarin on 2/4/18.
 */

public class UserModel extends RealmObject{
    private String nickname;
    private String password;
    private String avatar;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
