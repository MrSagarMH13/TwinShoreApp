/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.constant;

/**
 *
 * @author mrsagar
 */
public interface QueryConstant {

    String GET_LOGIN_MASTER = "SELECT lm FROM LoginMaster lm WHERE lm.appDoorPhone = :userName AND lm.appDoorKey = :password";
}
