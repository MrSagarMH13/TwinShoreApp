/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.dto;

/**
 *
 * @author mrsagar
 */
public class PatientDTO {

    private String patientID;
    private String slautation;
    private String fullName;
    private String gender;
    private String dateOfBirth;
    private String age;
    private String sMSPhonePrimary;
    private String sMSPhoneSecondary;
    private String emailIDPrimary;
    private String emailIDSecondary;
    private String diagnosis;
    private String loginPersonID;
    private String createdDateTime;
    private String createdPersonID;
    private String lastUpdatedDateTime;
    private String lastUpdatedPersonID;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getsMSPhonePrimary() {
        return sMSPhonePrimary;
    }

    public void setsMSPhonePrimary(String sMSPhonePrimary) {
        this.sMSPhonePrimary = sMSPhonePrimary;
    }

    public String getsMSPhoneSecondary() {
        return sMSPhoneSecondary;
    }

    public void setsMSPhoneSecondary(String sMSPhoneSecondary) {
        this.sMSPhoneSecondary = sMSPhoneSecondary;
    }

    public String getEmailIDPrimary() {
        return emailIDPrimary;
    }

    public void setEmailIDPrimary(String emailIDPrimary) {
        this.emailIDPrimary = emailIDPrimary;
    }

    public String getEmailIDSecondary() {
        return emailIDSecondary;
    }

    public void setEmailIDSecondary(String emailIDSecondary) {
        this.emailIDSecondary = emailIDSecondary;
    }

    public String getLoginPersonID() {
        return loginPersonID;
    }

    public void setLoginPersonID(String loginPersonID) {
        this.loginPersonID = loginPersonID;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getCreatedPersonID() {
        return createdPersonID;
    }

    public void setCreatedPersonID(String createdPersonID) {
        this.createdPersonID = createdPersonID;
    }

    public String getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(String lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public String getLastUpdatedPersonID() {
        return lastUpdatedPersonID;
    }

    public void setLastUpdatedPersonID(String lastUpdatedPersonID) {
        this.lastUpdatedPersonID = lastUpdatedPersonID;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

}
