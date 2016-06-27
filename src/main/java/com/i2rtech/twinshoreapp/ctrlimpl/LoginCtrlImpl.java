/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.ctrlimpl;

import com.i2rtech.twinshoreapp.auth.Authentication;
import com.i2rtech.twinshoreapp.auth.LoggedInUser;
import com.i2rtech.twinshoreapp.constant.AppConstant;
import com.i2rtech.twinshoreapp.constant.AppMsgConstant;
import com.i2rtech.twinshoreapp.ctrl.LoginCtrl;
import com.i2rtech.twinshoreapp.dto.LoginDTO;
import com.i2rtech.twinshoreapp.service.JNDIService;
import com.i2rtech.twinshoreapp.service.LoginService;
import com.i2rtech.twinshoreapp.utils.JsonConverter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mrsagar
 */
public class LoginCtrlImpl extends Authentication implements LoginCtrl {

    LoginService loginService = JNDIService.getLoginService();

    @Override
    public String userLogin(String userName, String password, HttpServletRequest request) {

        LoginDTO loginDTO = loginService.getUserDetails(userName, password, request);
        if (loginDTO.getMessageID().equals(AppMsgConstant.SUCCESS_ID)) {
            HttpSession session = getAppRequest().getSession();
            LoggedInUser user = loginService.getLoggedInUser();
            session.setAttribute(AppConstant.LOGGED_IN_USER, user);
            session.setMaxInactiveInterval(4 * 60 * 60);
        }
        return JsonConverter.createJsonFromDTO(loginDTO);
    }

}
