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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
        Especie especie1 = new Gato();
        Estado estado1 = Estado.INGRESADO;
        Propietario propietario1 = new Propietario("Maite","Molinos Iglesias");
        Mascota mascota1 = new Mascota(1, "perla1", especie1, estado1, new Date(), (short)2, propietario1);
        
        Especie especie2 = new Gato();
        Estado estado2 = Estado.INGRESADO;
        Propietario propietario2 = new Propietario("Maite1","Molinos1 Iglesias1");
        
        Mascota mascota2 = new Mascota(2, "perla2", especie2, estado2, new Date(), (short)2, propietario2);
        
        Especie especie3 = new Perro();
        Estado estado3 = Estado.ALTA;
        Propietario propietario3 = new Propietario("Maite2","Molinos3 Iglesias3");

        Mascota mascota3 = new Mascota(3, "perla3", especie3, estado3, new Date(), (short)2, propietario3);
        
        mascotas = new HashMap();
        
        mascotas.put(mascota1.getCodigo(), mascota1);
        mascotas.put(mascota2.getCodigo(), mascota2);
        mascotas.put(mascota3.getCodigo(), mascota3);
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
