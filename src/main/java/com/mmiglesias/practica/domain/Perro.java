package com.mmiglesias.practica.domain;

/**
 * Representa la especie Perro.
 * 
 * @author Maite
 */
public class Perro implements Especie {
    
    public final static String DESCRIPCION = "Canis lupus familiaris";
    
    public String getDescripcion() {
        return DESCRIPCION;
    } 
}

