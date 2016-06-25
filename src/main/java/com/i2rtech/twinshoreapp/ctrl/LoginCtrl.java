/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.ctrl;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mrsagar
 */
public interface LoginCtrl extends AuthenticationCtrl {

    public String userLogin(String userName, String password, HttpServletRequest request);

}
