/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.service;

import com.i2rtech.twinshoreapp.auth.LoggedInUser;
import com.i2rtech.twinshoreapp.dto.LoginDTO;
import javax.ejb.Local;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mrsagar
 */
@Local
public interface LoginService {

    public LoginDTO getUserDetails(String userName, String password, HttpServletRequest request);

    public LoggedInUser getLoggedInUser();

}
