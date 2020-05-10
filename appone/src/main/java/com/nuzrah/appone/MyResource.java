package com.nuzrah.appone;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Hello World GET Request!";
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String postTest() {
        return "Hello World POST Request!";
    }
    
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String putTest() {
        return "Hello World PUT Request!";
    }
    
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String deleteTest() {
        return "Hello World DELETE Request!";
    }
}
