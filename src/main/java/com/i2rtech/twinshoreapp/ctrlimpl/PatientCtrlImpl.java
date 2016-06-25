/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.ctrlimpl;

import com.i2rtech.twinshoreapp.auth.Authentication;
import com.i2rtech.twinshoreapp.constant.AppMsgConstant;
import com.i2rtech.twinshoreapp.ctrl.PatientCtrl;
import com.i2rtech.twinshoreapp.dto.MessageDTO;
import com.i2rtech.twinshoreapp.dto.PatientDTO;
import com.i2rtech.twinshoreapp.service.JNDIService;
import com.i2rtech.twinshoreapp.service.PatientService;
import com.i2rtech.twinshoreapp.utils.JsonConverter;

/**
 *
 * @author mrsagar
 */
public class PatientCtrlImpl extends Authentication implements PatientCtrl {

    PatientService patientService = JNDIService.getPatientService();

    @Override
    public String addPatient(PatientDTO patientDTO) {
        MessageDTO messageDTO = authenticationCheck(getApprequest(), null);
        if (messageDTO.getMessageID().equals(AppMsgConstant.VALID_URL_SUCCESS_ID)) {
            messageDTO = patientService.addPatient(patientDTO);
        }
        return JsonConverter.createJsonFromDTO(messageDTO);
    }

}
