/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.i2rtech.twinshoreapp.rest;

import com.i2rtech.twinshoreapp.ctrl.CtrlCollection;
import com.i2rtech.twinshoreapp.ctrl.PatientCtrl;
import com.i2rtech.twinshoreapp.dto.PatientDTO;
import com.i2rtech.twinshoreapp.utils.JsonConverter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author mrsagar
 */
@Path("patient")
public class PatientResource extends AppResource {

    @Context
    private UriInfo context;

    PatientCtrl patientCtrl;

    /**
     * Creates a new instance of PatientResource
     */
    public PatientResource() {
        this.patientCtrl = CtrlCollection.PATIENT_CTRL;
    }

    @POST
    @Path("/addPatient")
    @Produces(MediaType.APPLICATION_JSON)
    public String addPatient(String patientDataString) {
        PatientDTO patientDTO = (PatientDTO) JsonConverter.fromJsonToDTO(patientDataString, PatientDTO.class);
        String addPatientResponse = patientCtrl.addPatient(patientDTO);
        return addPatientResponse;
    }

    /**
     * Retrieves representation of an instance of
     * com.i2rtech.twinshoreapp.resource.PatientResource
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
     * PUT method for updating or creating an instance of PatientResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
