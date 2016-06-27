/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.rest;

import com.i2rtech.twinshoreapp.ctrl.CtrlCollection;
import com.i2rtech.twinshoreapp.ctrl.LoginCtrl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;

/**
 * REST Web Service
 *
 * @author mrsagar
 */
@Path("login")
public class LoginResource extends AppResource {

    @Context
    private UriInfo context;

    LoginCtrl loginCtrl;

    /**
     * Creates a new instance of LoginResource
     */
    public LoginResource() {
        this.loginCtrl = CtrlCollection.LOGIN_CTRL;
    }

    @POST
    @Path("/")
    @Produces("application/json")
    public String userLogin(@FormParam("userName") String userName,
            @FormParam("password") String password) {
        setHeaders();
        loginCtrl.setAppRequest(request);
        String userLoginResponse = loginCtrl.userLogin(userName, password, request);
        return userLoginResponse;
    }

    /**
     * Retrieves representation of an instance of
     * com.i2rtech.twinshoreapp.rest.LoginResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of LoginResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
