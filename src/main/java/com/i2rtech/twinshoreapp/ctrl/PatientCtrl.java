/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.ctrl;

import com.i2rtech.twinshoreapp.dto.PatientDTO;

/**
 *
 * @author mrsagar
 */
public interface PatientCtrl extends AuthenticationCtrl {

    public String addPatient(PatientDTO patientDTO);

}
