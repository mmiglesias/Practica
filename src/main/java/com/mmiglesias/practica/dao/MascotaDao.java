/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmiglesias.practica.dao;

import com.mmiglesias.practica.domain.Mascota;
import java.util.List;

/**
 *
 * @author Maite
 */
public interface MascotaDao {
   
    public Mascota getMascota(int codigo);
    
    public List<Mascota> getMascotas();
    
}
