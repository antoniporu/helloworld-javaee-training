package com.area.hello.world.controllers;

import com.area.hello.world.qualifiers.PersonaRequestServiceQualifier;
import com.area.hello.world.services.PersonaService;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author antoni.pont
 */
@Path("/peticion")
@Controller
public class PersonRequestController {

    @Inject
    Models models;

    @Inject
    @PersonaRequestServiceQualifier
    PersonaService personaService;

    @GET
    public String hola() {
        personaService.getAll();
        return "/WEB-INF/jsp/saludo.jsp";
    }

}
