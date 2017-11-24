/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmiglesias.practica.domain;

import java.util.Date;

/**
 *
 * @author Maite
 */
public class Mascota {
    
    private int codigo;
    private String nombre;
    //private Especie
    private Estado estado;
    private Date fechaNacimiento;
    private short numeroVisitas;
    private Propietario propietario;
    
}
