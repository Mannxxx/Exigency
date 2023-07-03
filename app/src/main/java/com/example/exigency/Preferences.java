package com.example.exigency;

import android.content.Context;
import android.content.SharedPreferences;

public class Preferences {
    Context context;
    String username;

    public Preferences(Context context) {
        this.context = context;
    }

    public String getUsername() {

        SharedPreferences pref = context.getSharedPreferences("pref",Context.MODE_PRIVATE);
        username = pref.getString("username","");
        return username;
    }

    public void setUsername(String username) {

        SharedPreferences pref = context.getSharedPreferences("pref",Context.MODE_PRIVATE);
        SharedPreferences.Editor edit=pref.edit();
        edit.putString("username",username);
        edit.commit();
        this.username = username;
    }

}

