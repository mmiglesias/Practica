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
public class Propietario {
    
    private String nombre;
    private String apellidos;

    public Propietario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    @Override
    public String toString() {
        return new StringBuilder(apellidos).append(", ").append(nombre).toString();
    }
    
    
}
