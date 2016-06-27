/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.dto;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author mrsagar
 */
public class LoginDTO {

    private Integer doctorStaffID;
    private String slautation;
    private String fullName;
    private Character gender;
    private Date dateOfBirth;
    private Short age;
    private BigInteger sMSPhonePrimary;
    private String emailIDPrimary;
    private Character doctorStaffRole;
    private String messageID;

    public Integer getDoctorStaffID() {
        return doctorStaffID;
    }

    public void setDoctorStaffID(Integer doctorStaffID) {
        this.doctorStaffID = doctorStaffID;
    }

    public String getSlautation() {
        return slautation;
    }

    public void setSlautation(String slautation) {
        this.slautation = slautation;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public BigInteger getsMSPhonePrimary() {
        return sMSPhonePrimary;
    }

    public void setsMSPhonePrimary(BigInteger sMSPhonePrimary) {
        this.sMSPhonePrimary = sMSPhonePrimary;
    }

    public String getEmailIDPrimary() {
        return emailIDPrimary;
    }

    public void setEmailIDPrimary(String emailIDPrimary) {
        this.emailIDPrimary = emailIDPrimary;
    }

    public Character getDoctorStaffRole() {
        return doctorStaffRole;
    }

    public void setDoctorStaffRole(Character doctorStaffRole) {
        this.doctorStaffRole = doctorStaffRole;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }

}
