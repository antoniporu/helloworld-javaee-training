package com.area.hello.world.services;

import com.area.hello.world.models.Persona;
import java.util.List;

/**
 *
 * @author antoni.pont
 */
public interface PersonaService {
    Persona add(Persona persona);
    List<Persona> getAll();
}
