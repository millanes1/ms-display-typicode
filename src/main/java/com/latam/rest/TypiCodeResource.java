package com.example.demo.rest;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * 
 * @author millanes
 *
 */
@Path("/todos")
public class TypiCodeResource {

    @Inject
    PersistenceHelper helper;

    @GET
    @Produces("application/json")
    public TypiCode[] get() {
        return helper.getEntityManager().createNamedQuery("TypiCode.findAll", TypiCode.class).getResultList().toArray(new TypiCode[0]);
    }
}