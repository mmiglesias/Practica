/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmiglesias.practica.domain;

/**
 *
 * @author Maite
 */
public enum Estado {
    INGRESADO("INGRESADO"), ALTA("ALTA");
    
    private String descripcion;
    
    Estado(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
   
}
