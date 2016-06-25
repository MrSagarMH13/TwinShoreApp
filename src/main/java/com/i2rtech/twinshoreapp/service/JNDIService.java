package com.i2rtech.twinshoreapp.service;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Sagar
 */
public abstract class JNDIService {

    public final static PatientService getPatientService() {
        PatientService patientService = null;
        try {
            Context context = getInitialContext();
            patientService = (PatientService) context.lookup("java:global/Zchromo/PatientServiceBean");
        } catch (NamingException ex) {
            Logger.getLogger(PatientService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patientService;
    }

    private static Context getInitialContext() {
        Hashtable propertis = new Hashtable();
        propertis.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
        propertis.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.as.naming.InitialContextFactory");
        propertis.put(Context.PROVIDER_URL, "jnp://localhost:1099");
        Context ctx = null;
        try {
            ctx = new InitialContext();//(propertis);
        } catch (NamingException ex) {
            Logger.getLogger(JNDIService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ctx;
    }
}
