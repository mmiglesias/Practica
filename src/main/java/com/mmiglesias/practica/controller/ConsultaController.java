package com.mmiglesias.practica.controller;

import com.mmiglesias.practica.dao.MascotaDao;
import com.mmiglesias.practica.dao.impl.MascotaDaoImpl;
import com.mmiglesias.practica.domain.Mascota;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsultaController {

	@RequestMapping("/consulta")
	public ModelAndView consulta(int codigo) {
            ModelAndView mv = new ModelAndView("consulta");

            MascotaDao mascotaDao = new MascotaDaoImpl();                
            Mascota mascota = mascotaDao.getMascota(codigo);
            mv.addObject("mascota", mascota);
            return mv;
	}

}
