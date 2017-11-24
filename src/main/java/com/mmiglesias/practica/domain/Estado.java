package com.mmiglesias.practica.domain;

/**
 * Representa un estado.
 * 
 * @author Maite
 */
public enum Estado {
    
    INGRESADO("INGRESADO"), ALTA("ALTA");
    
    private final String descripcion;
    
    Estado(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
