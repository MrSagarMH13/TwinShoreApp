/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

/**
 *
 * @author mrsagar
 */
public class AppResource {

    @Context
    HttpServletResponse response;

    @Context
    HttpServletRequest request;

    protected void setHeaders() {
        response.getHeaderNames().add("Access-Control-Allow-Origin:*");
    }
}
