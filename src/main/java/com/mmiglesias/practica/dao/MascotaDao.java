package com.mmiglesias.practica.dao;

import com.mmiglesias.practica.domain.Mascota;
import java.util.List;

/**
 * Mascotas DAO
 * 
 * @author Maite
 */
public interface MascotaDao {
   
    /**
    * Obtiene una mascota dado un codigo.
    *
    * @param codigo el codigo
    * @return la mascota
    */
    public Mascota getMascota(int codigo);
    
    /**
    * Obtiene la lista de mascotas.
    *
    * @return la lista de mascotas
    */
    public List<Mascota> getMascotas();
}
