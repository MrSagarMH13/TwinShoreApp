/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.service;

import com.i2rtech.twinshoreapp.dto.MessageDTO;
import com.i2rtech.twinshoreapp.dto.PatientDTO;
import javax.ejb.Local;

/**
 *
 * @author mrsagar
 */
@Local
public interface PatientService {

    public MessageDTO addPatient(PatientDTO patientDTO);

}
