/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.i2rtech.twinshoreapp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author mrsagar
 */
@Entity
@Table(name = "Diagnosis")
@NamedQueries({
    @NamedQuery(name = "Diagnosis.findAll", query = "SELECT d FROM Diagnosis d")})
public class Diagnosis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DiagnosisID")
    private Integer diagnosisID;
    @Size(max = 25)
    @Column(name = "DiagnosisName")
    private String diagnosisName;
    @Column(name = "IsActive")
    private Boolean isActive;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "diagnosisID", fetch = FetchType.LAZY)
    private List<PatientDiagnosis> patientDiagnosisList;

    public Diagnosis() {
    }

    public Diagnosis(Integer diagnosisID) {
        this.diagnosisID = diagnosisID;
    }

    public Integer getDiagnosisID() {
        return diagnosisID;
    }

    public void setDiagnosisID(Integer diagnosisID) {
        this.diagnosisID = diagnosisID;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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

    public List<PatientDiagnosis> getPatientDiagnosisList() {
        return patientDiagnosisList;
    }

    public void setPatientDiagnosisList(List<PatientDiagnosis> patientDiagnosisList) {
        this.patientDiagnosisList = patientDiagnosisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (diagnosisID != null ? diagnosisID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnosis)) {
            return false;
        }
        Diagnosis other = (Diagnosis) object;
        if ((this.diagnosisID == null && other.diagnosisID != null) || (this.diagnosisID != null && !this.diagnosisID.equals(other.diagnosisID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.i2rtech.twinshoreapp.entity.Diagnosis[ diagnosisID=" + diagnosisID + " ]";
    }
    
}
