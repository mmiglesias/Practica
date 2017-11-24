package com.mmiglesias.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListadoController {

	String message = "Welcome to Spring MVC!";

	@RequestMapping("/listado")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("listado");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}

}
