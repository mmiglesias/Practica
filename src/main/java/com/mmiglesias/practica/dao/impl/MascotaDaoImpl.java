/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmiglesias.practica.dao.impl;

import com.mmiglesias.practica.dao.MascotaDao;
import com.mmiglesias.practica.domain.Mascota;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Maite
 */
public class MascotaDaoImpl implements MascotaDao{

    private static MascotaDaoImpl INSTANCE = new MascotaDaoImpl();
    
    //private Map<int, Mascota> mascotas; 
    
    private MascotaDaoImpl() {}
    
    public static MascotaDaoImpl getInstance() {
        return INSTANCE;
    }
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new MascotaDaoImpl();
        }
    }
    
    public Mascota getMascota(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Mascota> getMascotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
