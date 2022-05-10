package com.example.a3lafan.Commen;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.a3lafan.login.loginActivity;

import java.util.HashMap;

public class UserData {
    private SharedPreferences mSharedPreferences;
    private  SharedPreferences.Editor mEditor;
    private Context mContext;
    private int PRIVATE_MODE = 0;
    private Intent mIntent;



    private static final String PREF_NAME = "MyApp";

    public static final String IS_LOGIN = "IsLoggedIn";
    public static final String KEY_NAME = "key_fname";
    public static final String KEY_PHONE = "key_phone";

    /**
     * Constructor
     **/
    public UserData(Context context) {
        this.mContext = context;
        mSharedPreferences = mContext.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        mEditor = mSharedPreferences.edit();
    }

    /**
     * Save User Details
     **/
    public void createLoginSession(Boolean status,
                                   String name) {

        mEditor.putBoolean(IS_LOGIN, status);
        mEditor.putString(KEY_NAME, name);
        mEditor.commit();
    }


    /**
     * Get stored session data
     */
    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> users = new HashMap<String, String>();

        users.put(KEY_NAME, mSharedPreferences.getString(KEY_NAME, null));
        users.put(KEY_PHONE, mSharedPreferences.getString(KEY_PHONE, null));

        return users;
    }


    public void clearData(){
        mEditor.clear();
        mEditor.commit();
    }

    /**
     * Clear session details
     */
    public void logoutUser() {
        mEditor.clear();
        mEditor.commit();
        mIntent = new Intent(mContext, loginActivity.class);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(mIntent);
    }

    /**
     * Quick check for login
     **/
    public boolean isLoggedIn() {
        return mSharedPreferences.getBoolean(IS_LOGIN, false);
    }
}
