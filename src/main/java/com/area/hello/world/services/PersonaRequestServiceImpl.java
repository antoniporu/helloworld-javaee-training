package com.area.hello.world.services;

import com.area.hello.world.models.Persona;
import com.area.hello.world.qualifiers.PersonaRequestServiceQualifier;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author antoni.pont
 */
@RequestScoped
@PersonaRequestServiceQualifier
public class PersonaRequestServiceImpl implements PersonaService {

    @Override
    public Persona add(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> getAll() {
        return new ArrayList<>();
    }
    
}
