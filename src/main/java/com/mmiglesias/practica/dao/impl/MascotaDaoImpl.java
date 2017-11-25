/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmiglesias.practica.dao.impl;

import com.mmiglesias.practica.dao.MascotaDao;
import com.mmiglesias.practica.domain.Especie;
import com.mmiglesias.practica.domain.Estado;
import com.mmiglesias.practica.domain.Gato;
import com.mmiglesias.practica.domain.Mascota;
import com.mmiglesias.practica.domain.Perro;
import com.mmiglesias.practica.domain.Propietario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maite
 */
public class MascotaDaoImpl implements MascotaDao{
    
    public Mascota getMascota(int codigo) {
        return Singleton.getInstance().getMascotas().get(codigo);
    }

    public List<Mascota> getMascotas() {
        return new ArrayList(Singleton.getInstance().getMascotas().values());
    }   
}

class Singleton {
    
    private static Singleton INSTANCE = null;
    
    private Map<Integer, Mascota> mascotas; 

    private Singleton(){
    
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Especie especie1 = new Gato();
        Estado estado1 = Estado.INGRESADO;       
        Propietario propietario1 = new Propietario("Manuel","García Pérez");        
        Date fechaNacimiento1 = null;
        try {
            fechaNacimiento1 = sdf.parse("12/05/2012");
        } catch (ParseException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        Mascota mascota1 = new Mascota(0001, "Rufo", especie1, estado1, fechaNacimiento1, (short)2, propietario1);
 
        
        Especie especie2 = new Gato();
        Estado estado2 = Estado.INGRESADO;
        Propietario propietario2 = new Propietario("Maria","Pérez García");
        Date fechaNacimiento2 = null;
        try {
            fechaNacimiento2 = sdf.parse("17/10/2002");
        } catch (ParseException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        Mascota mascota2 = new Mascota(0002, "Lucy", especie2, estado2, fechaNacimiento2, (short)2, propietario2);
        
        Especie especie3 = new Perro();
        Estado estado3 = Estado.ALTA;
        Propietario propietario3 = new Propietario("Manuel","García Pérez");
        Date fechaNacimiento3 = null;
        try {
            fechaNacimiento3 = sdf.parse("10/01/2005");
        } catch (ParseException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
        }   
        Mascota mascota3 = new Mascota(0003, "Pepo", especie3, estado3, fechaNacimiento3, (short)2, propietario3);
     
        Especie especie4 = new Perro();
        Estado estado4 = Estado.INGRESADO;
        Propietario propietario4 = new Propietario("Ana","Aranda Alonso");
        Date fechaNacimiento4 = null;
        try {
            fechaNacimiento4 = sdf.parse("07/05/2008");
        } catch (ParseException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
        }        
        Mascota mascota4 = new Mascota(0003, "Rayo", especie4, estado4, fechaNacimiento4, (short)2, propietario4);
       
        mascotas = new HashMap();
        
        mascotas.put(mascota1.getCodigo(), mascota1);
        mascotas.put(mascota2.getCodigo(), mascota2);
        mascotas.put(mascota3.getCodigo(), mascota3);
        mascotas.put(mascota4.getCodigo(), mascota4);
    }

    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Singleton();
        }
    }
    
    public static Singleton getInstance() {
        if (INSTANCE == null) 
            createInstance();
        return INSTANCE;
    }

    public Map<Integer, Mascota> getMascotas() {
        return mascotas;
    }
    
}
