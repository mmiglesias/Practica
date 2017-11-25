package com.mmiglesias.practica.controller;

import com.mmiglesias.practica.dao.MascotaDao;
import com.mmiglesias.practica.dao.impl.MascotaDaoImpl;
import com.mmiglesias.practica.domain.Mascota;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoController {

    @RequestMapping("/listado")
    public ModelAndView showMessage() {
        MascotaDao mascotaDao = new MascotaDaoImpl();
        List<Mascota> mascotas = mascotaDao.getMascotas();
        ModelAndView modelAndView = new ModelAndView("listado");
        modelAndView.addObject("mascotas", mascotas);
        return modelAndView;
    }
}
