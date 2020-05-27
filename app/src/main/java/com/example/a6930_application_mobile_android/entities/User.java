package com.example.a6930_application_mobile_android.entities;

import java.io.Serializable;

public class User implements Serializable {

    //constant to identify the user instance to pass between activities
    public static String USER_KEY = "USER";
    private String userName;
    private Integer userID;
    private String userEmail;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
