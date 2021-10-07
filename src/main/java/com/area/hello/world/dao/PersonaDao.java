package com.area.hello.world.dao;

import com.area.hello.world.models.Persona;
import java.util.List;

/**
 *
 * @author antoni.pont
 */
public interface PersonaDao {
    
    Persona add(Persona persona);
    List<Persona> getAll();
    
}
