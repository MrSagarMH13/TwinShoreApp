package com.i2rtech.twinshoreapp.ctrl;

import com.i2rtech.twinshoreapp.ctrlimpl.LoginCtrlImpl;
import com.i2rtech.twinshoreapp.ctrlimpl.PatientCtrlImpl;

/**
 *
 * @author Sagar
 */
public interface CtrlCollection {

    public LoginCtrl LOGIN_CTRL = new LoginCtrlImpl();
    public PatientCtrl PATIENT_CTRL = new PatientCtrlImpl();

}
