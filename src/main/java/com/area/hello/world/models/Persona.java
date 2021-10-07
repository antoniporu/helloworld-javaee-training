package com.area.hello.world.models;

import javax.ws.rs.FormParam;

/**
 *
 * @author antoni.pont
 */
public class Persona {

    private int id;

    @FormParam("nombre")
    private String nombre;

    @FormParam("apellidos")
    private String apellidos;

    @FormParam("dni")
    private String dni;

    private Direccion direccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
