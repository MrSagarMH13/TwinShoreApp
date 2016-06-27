package com.i2rtech.twinshoreapp.ctrlimpl;

import com.i2rtech.twinshoreapp.auth.Authentication;
import com.i2rtech.twinshoreapp.constant.AppMsgConstant;
import com.i2rtech.twinshoreapp.ctrl.PatientCtrl;
import com.i2rtech.twinshoreapp.dto.MessageDTO;
import com.i2rtech.twinshoreapp.dto.PatientDTO;
import com.i2rtech.twinshoreapp.service.JNDIService;
import com.i2rtech.twinshoreapp.service.PatientService;
import com.i2rtech.twinshoreapp.utils.JsonConverter;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author mrsagar
 */
public class PatientCtrlImpl extends Authentication implements PatientCtrl {

    PatientService patientService = JNDIService.getPatientService();

    @Override
    public String addPatient(PatientDTO patientDTO) {
        String doctorAccessRole = "";
        if (StringUtils.isNotBlank(patientDTO.getDiagnosis())) {
            doctorAccessRole = "D";
        }
        MessageDTO messageDTO = authenticationCheck(getAppRequest(), doctorAccessRole);
        if (messageDTO.getMessageID().equals(AppMsgConstant.VALID_URL_SUCCESS_ID)) {
            messageDTO = patientService.addPatient(patientDTO);
        }
        return JsonConverter.createJsonFromDTO(messageDTO);
    }
}
