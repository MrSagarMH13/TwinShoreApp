/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.auth;

import com.i2rtech.twinshoreapp.constant.AppConstant;
import com.i2rtech.twinshoreapp.constant.AppMsgConstant;
import com.i2rtech.twinshoreapp.dto.MessageDTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author mrsagar
 */
public class Authentication {

    private HttpServletRequest apprequest = null;

    public final MessageDTO authenticationCheck(HttpServletRequest request, String allowedUserRole) {
        MessageDTO messageDTO = new MessageDTO();
        String key = getAuthenticatedKey(request);
        boolean isValidUser = validateUser(key, allowedUserRole);
        if (isValidUser) {
            messageDTO.setMessageID(AppMsgConstant.VALID_URL_SUCCESS_ID);
            messageDTO.setMessageText(AppMsgConstant.VALID_URL_SUCCESS_TEXT);
        } else {
            messageDTO.setMessageID(AppMsgConstant.VALID_URL_FAILURE_ID);
            messageDTO.setMessageText(AppMsgConstant.VALID_URL_FAILURE_TEXT);
        }
        return messageDTO;
    }

    private String getAuthenticatedKey(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String userRole = null;
        if (session.getAttribute(AppConstant.LOGGED_IN_USER) != null) {
            LoggedInUser user = (LoggedInUser) session.getAttribute(AppConstant.LOGGED_IN_USER);
            if (user != null) {
                if (user.getUserName() != null) {
                    userRole = user.getUserRole();
                }
            }
        }
        return userRole;
    }

    public boolean validateUser(String key, String allowedUserRole) {
        if (StringUtils.isNotBlank(key)) {
            if (StringUtils.isBlank(allowedUserRole) || key.equals(allowedUserRole)) {
                return true;
            }
        }
        return false;
    }

    public HttpServletRequest getApprequest() {
        return apprequest;
    }

    public void setApprequest(HttpServletRequest apprequest) {
        this.apprequest = apprequest;
    }

    public String getIPFromRequest(HttpServletRequest request) {
        String ipAddress = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotBlank(ipAddress) && ipAddress.contains(",")) {
            ipAddress = ipAddress.split(",")[0];
        }
        if (StringUtils.isNotBlank(ipAddress) && ipAddress.length() > 15) {
            ipAddress = ipAddress.substring(0, 14);
        }
        if (StringUtils.isBlank(ipAddress)) {
            ipAddress = request.getRemoteAddr();
        }
        if (StringUtils.isBlank(ipAddress)) {
            ipAddress = request.getRemoteAddr();
        }
        return ipAddress;
    }
}
