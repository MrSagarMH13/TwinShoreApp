/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mrsagar
 */
@Entity
@Table(name = "Patient")
@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT p FROM Patient p")})
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PatientID")
    private Integer patientID;
    @Size(max = 5)
    @Column(name = "Slautation")
    private String slautation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "FullName")
    private String fullName;
    @Column(name = "Gender")
    private Character gender;
    @Column(name = "DateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "SMSPhonePrimary")
    private BigInteger sMSPhonePrimary;
    @Column(name = "SMSPhoneSecondary")
    private BigInteger sMSPhoneSecondary;
    @Size(max = 255)
    @Column(name = "EmailIDPrimary")
    private String emailIDPrimary;
    @Size(max = 255)
    @Column(name = "EmailIDSecondary")
    private String emailIDSecondary;
    @Column(name = "CreatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;
    @Column(name = "CreatedPersonID")
    private Integer createdPersonID;
    @Column(name = "LastUpdatedDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDateTime;
    @Column(name = "LastUpdatedPersonID")
    private Integer lastUpdatedPersonID;

    public Patient() {
    }

    public Patient(Integer patientID) {
        this.patientID = patientID;
    }

    public Patient(Integer patientID, String fullName) {
        this.patientID = patientID;
        this.fullName = fullName;
    }

    public Integer getPatientID() {
        return patientID;
    }

    public void setPatientID(Integer patientID) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigInteger getSMSPhonePrimary() {
        return sMSPhonePrimary;
    }

    public void setSMSPhonePrimary(BigInteger sMSPhonePrimary) {
        this.sMSPhonePrimary = sMSPhonePrimary;
    }

    public BigInteger getSMSPhoneSecondary() {
        return sMSPhoneSecondary;
    }

    public void setSMSPhoneSecondary(BigInteger sMSPhoneSecondary) {
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

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public Integer getCreatedPersonID() {
        return createdPersonID;
    }

    public void setCreatedPersonID(Integer createdPersonID) {
        this.createdPersonID = createdPersonID;
    }

    public Date getLastUpdatedDateTime() {
        return lastUpdatedDateTime;
    }

    public void setLastUpdatedDateTime(Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    public Integer getLastUpdatedPersonID() {
        return lastUpdatedPersonID;
    }

    public void setLastUpdatedPersonID(Integer lastUpdatedPersonID) {
        this.lastUpdatedPersonID = lastUpdatedPersonID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientID != null ? patientID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.patientID == null && other.patientID != null) || (this.patientID != null && !this.patientID.equals(other.patientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.i2rtech.twinshoreapp.entity.Patient[ patientID=" + patientID + " ]";
    }

}
