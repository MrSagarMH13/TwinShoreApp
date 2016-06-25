/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.servicebean;

import com.i2rtech.twinshoreapp.constant.AppMsgConstant;
import com.i2rtech.twinshoreapp.dto.MessageDTO;
import com.i2rtech.twinshoreapp.dto.PatientDTO;
import com.i2rtech.twinshoreapp.entity.Patient;
import com.i2rtech.twinshoreapp.service.PatientService;
import com.i2rtech.twinshoreapp.utils.AppDateUtils;
import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author mrsagar
 */
@Stateless
public class PatientServiceBean implements PatientService {

    @PersistenceContext
    EntityManager em;

    Logger logger = LoggerFactory.getLogger(PatientServiceBean.class);

    @Override
    public MessageDTO addPatient(PatientDTO patientDTO) {
        logger.info(PatientServiceBean.class + " addPatient() START ");
        MessageDTO messageDTO = new MessageDTO();
        try {
            Patient patient = mapPatientFromDTO(patientDTO);
            if (patient != null) {
                if (StringUtils.isNotBlank(patientDTO.getPatientID())) {
                    em.merge(patient);
                    messageDTO.setMessageID(AppMsgConstant.UPDATE_SUCCESS_ID);
                    messageDTO.setMessageText(AppMsgConstant.UPDATE_SUCCESS_TEXT);
                } else {
                    em.persist(patient);
                    messageDTO.setMessageID(AppMsgConstant.INSERT_SUCCESS_ID);
                    messageDTO.setMessageText(AppMsgConstant.INSERT_SUCCESS_TEXT);
                }
                patientDTO.setPatientID(patient.getPatientID().toString());
                messageDTO.setPatient(patientDTO);
            } else {
                messageDTO.setMessageID(AppMsgConstant.INSERT_FAILURE_ID);
                messageDTO.setMessageText(AppMsgConstant.INSERT_FAILURE_TEXT);
            }
        } catch (Exception e) {
            messageDTO.setMessageID(AppMsgConstant.INSERT_FAILURE_ID);
            messageDTO.setMessageText(AppMsgConstant.INSERT_FAILURE_TEXT);
            logger.error(PatientServiceBean.class + " addPatient() ERROR : " + e.toString());
        }
        logger.info(PatientServiceBean.class + " addPatient() END ");
        return messageDTO;
    }

    private Patient mapPatientFromDTO(PatientDTO patientDTO) {
        Patient patient = null;
        if (StringUtils.isNotBlank(patientDTO.getPatientID())) {
            patient = em.find(Patient.class, Integer.parseInt(patientDTO.getPatientID()));
            if (patient == null) {
                return patient;
            }
        } else {
            patient = new Patient();
            patient.setCreatedDateTime(AppDateUtils.getCurrentDateAndTime());
            patient.setCreatedPersonID(Integer.parseInt(patientDTO.getLoginPersonID()));
        }
        patient.setLastUpdatedDateTime(AppDateUtils.getCurrentDateAndTime());
        patient.setLastUpdatedPersonID(Integer.parseInt(patientDTO.getLoginPersonID()));
        patient.setFullName(patient.getFullName());
        if (StringUtils.isNotBlank(patientDTO.getsMSPhonePrimary())) {
            patient.setSMSPhonePrimary(new BigInteger(patientDTO.getsMSPhonePrimary()));
        } else {
            patient.setSMSPhonePrimary(null);
        }
        if (StringUtils.isNotBlank(patientDTO.getsMSPhoneSecondary())) {
            patient.setSMSPhoneSecondary(new BigInteger(patientDTO.getsMSPhoneSecondary()));
        } else {
            patient.setSMSPhoneSecondary(null);
        }
        patient.setEmailIDPrimary(patientDTO.getEmailIDPrimary());
        patient.setEmailIDSecondary(patientDTO.getEmailIDSecondary());
        if (StringUtils.isNotBlank(patientDTO.getAge())) {
            patient.setAge(Integer.parseInt(patientDTO.getAge()));
        } else {
            patient.setAge(null);
        }
        patient.setSlautation(patientDTO.getSlautation());

        return patient;
    }

}
