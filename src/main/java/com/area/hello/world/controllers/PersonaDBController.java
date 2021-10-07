package com.area.hello.world.controllers;

import com.area.hello.world.models.Persona;
import com.area.hello.world.services.PersonaService;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author antoni.pont
 */
@Path("/personadb")
@Controller
public class PersonaDBController {

    @Inject
    Models models;

    @Inject
    PersonaService personaService;

    @POST
    @Path("/new")
    public String postPersonaDB(@BeanParam Persona persona) {
        String result = "/WEB-INF/jsp/saludo-persona.jsp";
        persona = personaService.add(persona);
        models.put("id", persona.getId());
        models.put("nombre", persona.getNombre());
        models.put("apellidos", persona.getApellidos());
        models.put("dni", persona.getDni());

        return result;
    }

}
