package com.mmiglesias.practica.domain;

/**
 * Representa la especie Gato.
 * 
 * @author Maite
 */
public class Gato implements Especie {
    
    public final static String DESCRIPCION = "Felis silvestris catus";
    
    public String getDescripcion() {
        return DESCRIPCION;
    } 
}
