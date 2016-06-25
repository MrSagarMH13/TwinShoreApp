/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.i2rtech.twinshoreapp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mrsagar
 */
@Entity
@Table(name = "PatientDiagnosis")
@NamedQueries({
    @NamedQuery(name = "PatientDiagnosis.findAll", query = "SELECT p FROM PatientDiagnosis p")})
public class PatientDiagnosis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PatientDiagnosisID")
    private Integer patientDiagnosisID;
    @Column(name = "PatientDiagnosisDate")
    @Temporal(TemporalType.DATE)
    private Date patientDiagnosisDate;
    @Column(name = "IsDeleted")
    private Boolean isDeleted;
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
    @JoinColumn(name = "DiagnosisID", referencedColumnName = "DiagnosisID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Diagnosis diagnosisID;

    public PatientDiagnosis() {
    }

    public PatientDiagnosis(Integer patientDiagnosisID) {
        this.patientDiagnosisID = patientDiagnosisID;
    }

    public Integer getPatientDiagnosisID() {
        return patientDiagnosisID;
    }

    public void setPatientDiagnosisID(Integer patientDiagnosisID) {
        this.patientDiagnosisID = patientDiagnosisID;
    }

    public Date getPatientDiagnosisDate() {
        return patientDiagnosisDate;
    }

    public void setPatientDiagnosisDate(Date patientDiagnosisDate) {
        this.patientDiagnosisDate = patientDiagnosisDate;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
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

    public Diagnosis getDiagnosisID() {
        return diagnosisID;
    }

    public void setDiagnosisID(Diagnosis diagnosisID) {
        this.diagnosisID = diagnosisID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientDiagnosisID != null ? patientDiagnosisID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatientDiagnosis)) {
            return false;
        }
        PatientDiagnosis other = (PatientDiagnosis) object;
        if ((this.patientDiagnosisID == null && other.patientDiagnosisID != null) || (this.patientDiagnosisID != null && !this.patientDiagnosisID.equals(other.patientDiagnosisID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.i2rtech.twinshoreapp.entity.PatientDiagnosis[ patientDiagnosisID=" + patientDiagnosisID + " ]";
    }
    
}
