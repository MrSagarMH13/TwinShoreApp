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
import javax.validation.constraints.Size;

/**
 *
 * @author mrsagar
 */
@Entity
@Table(name = "LoginMaster")
@NamedQueries({
    @NamedQuery(name = "LoginMaster.findAll", query = "SELECT l FROM LoginMaster l")})
public class LoginMaster implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LoginMasterID")
    private Integer loginMasterID;
    @Column(name = "PersonID")
    private Integer personID;
    @Size(max = 255)
    @Column(name = "AppDoorEmail")
    private String appDoorEmail;
    @Column(name = "AppDoorPhone")
    private BigInteger appDoorPhone;
    @Size(max = 40)
    @Column(name = "AppDoorKey")
    private String appDoorKey;
    @Size(max = 45)
    @Column(name = "IsActive")
    private String isActive;
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

    public LoginMaster() {
    }

    public LoginMaster(Integer loginMasterID) {
        this.loginMasterID = loginMasterID;
    }

    public Integer getLoginMasterID() {
        return loginMasterID;
    }

    public void setLoginMasterID(Integer loginMasterID) {
        this.loginMasterID = loginMasterID;
    }

    public Integer getPersonID() {
        return personID;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public String getAppDoorEmail() {
        return appDoorEmail;
    }

    public void setAppDoorEmail(String appDoorEmail) {
        this.appDoorEmail = appDoorEmail;
    }

    public BigInteger getAppDoorPhone() {
        return appDoorPhone;
    }

    public void setAppDoorPhone(BigInteger appDoorPhone) {
        this.appDoorPhone = appDoorPhone;
    }

    public String getAppDoorKey() {
        return appDoorKey;
    }

    public void setAppDoorKey(String appDoorKey) {
        this.appDoorKey = appDoorKey;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginMasterID != null ? loginMasterID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoginMaster)) {
            return false;
        }
        LoginMaster other = (LoginMaster) object;
        if ((this.loginMasterID == null && other.loginMasterID != null) || (this.loginMasterID != null && !this.loginMasterID.equals(other.loginMasterID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.i2rtech.twinshoreapp.entity.LoginMaster[ loginMasterID=" + loginMasterID + " ]";
    }
    
}
