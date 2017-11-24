package com.mmiglesias.practica.controller;

import com.mmiglesias.practica.domain.Especie;
import com.mmiglesias.practica.domain.Estado;
import com.mmiglesias.practica.domain.Gato;
import com.mmiglesias.practica.domain.Mascota;
import com.mmiglesias.practica.domain.Propietario;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsultaController {

	@RequestMapping("/consulta")
	public ModelAndView consulta(int codigo) {
            ModelAndView mv = new ModelAndView("consulta");
            Especie especie = new Gato();
            Estado estado = Estado.INGRESADO;
            Propietario propietario = new Propietario("Maite","Molinos Iglesias");
            Mascota mascota = new Mascota(1, "perla", especie, estado, new Date(), (short)2, propietario);
            mv.addObject("mascota", mascota);
            return mv;
	}

}
