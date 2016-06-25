/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.auth;

import java.io.Serializable;

/**
 *
 * @author mrsagar
 */
public class LoggedInUser implements Serializable {

    private Integer userID;
    private String userName;
    private String emailID;
    private String smsPhonePrimary;
    private String userRole;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getSmsPhonePrimary() {
        return smsPhonePrimary;
    }

    public void setSmsPhonePrimary(String smsPhonePrimary) {
        this.smsPhonePrimary = smsPhonePrimary;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
