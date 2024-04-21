package com.empresa.proyecto.rest;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;
import com.empresa.proyecto.beans.producto;

/**
 * REST Web Service
 *
 * @author ANDRES AVILA
 */
@Path("producto")
public class ProductoResource {
    
    @Context
    private UriInfo context;

    public ProductoResource() {
    }

    @GET
    @Path("getHtml")
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() {
        return "<h1>HOLA MUNDO REST</h1>";
    }

    @GET
    @Path("getXtml")
    @Produces(MediaType.TEXT_XML)
    public String getXtml() {
        return "<mensaje>HOLA MUNDO REST</mensaje>";
    }

    private static final List<producto> lista = new ArrayList<>();

    
}