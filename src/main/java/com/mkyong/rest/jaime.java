/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
/**
 *
 * @author james
 */
@Path("/jaime")
public class jaime {
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hola(){
        return "<html> " + "<title>" + "Hello World from JAX-RS" + "</title>"
                    + "<body><h1>" + "Hello World from JAX-RS" + "</body></h1>" + "</html> ";
    }
    
}
