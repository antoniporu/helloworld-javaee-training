package com.area.hello.world.models;

import javax.ws.rs.FormParam;

/**
 *
 * @author antoni.pont
 */
public class Direccion {

    private int id;
    
    @FormParam("calle")
    private String calle;
    
    @FormParam("poblacion")
    private String poblacion;
    
    @FormParam("provincia")
    private String provincia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
