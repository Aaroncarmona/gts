package com.gmail.carmonespi.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gmail.carmonespi.app.service.ITurnoService;

@Controller
@SessionAttributes("turno")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;
	
	@RequestMapping(value="/turnos" , method = RequestMethod.GET)
	public String show(Model model) {
		model.addAttribute("titulo","Listado");
		model.addAttribute("turnos" , turnoService.findAll());
		return "empleados";
	}
}
