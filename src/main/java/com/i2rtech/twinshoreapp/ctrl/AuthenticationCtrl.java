package com.i2rtech.twinshoreapp.ctrl;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mrsagar
 */
public interface AuthenticationCtrl {

    public void setAppRequest(HttpServletRequest request);

    public HttpServletRequest getAppRequest();
}
