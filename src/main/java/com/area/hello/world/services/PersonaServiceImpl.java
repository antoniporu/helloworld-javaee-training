package com.area.hello.world.services;

import com.area.hello.world.dao.PersonaDao;
import com.area.hello.world.models.Persona;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author antoni.pont
 */
@Dependent
public class PersonaServiceImpl implements PersonaService{
    
    @Inject
    PersonaDao personaDao;

    @Override
    public Persona add(Persona persona) {
        return personaDao.add(persona);
    }

    @Override
    public List<Persona> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
