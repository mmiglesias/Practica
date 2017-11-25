package com.mmiglesias.practica.controller;

import com.mmiglesias.practica.dao.MascotaDao;
import com.mmiglesias.practica.dao.impl.MascotaDaoImpl;
import com.mmiglesias.practica.domain.Mascota;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoController {

	@RequestMapping("/listado")
	public ModelAndView showMessage() {

            MascotaDao mascotaDao = new MascotaDaoImpl();                
            List<Mascota> listaMascotas = mascotaDao.getMascotas();

            ModelAndView mv = new ModelAndView("listado");
            mv.addObject("mascotas", listaMascotas);
            return mv;
	}

}
