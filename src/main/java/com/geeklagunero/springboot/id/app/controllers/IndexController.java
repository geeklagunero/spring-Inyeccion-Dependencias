package com.geeklagunero.springboot.id.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.geeklagunero.springboot.id.app.models.service.IMiServicio;
import com.geeklagunero.springboot.id.app.models.service.MiServicio;

@Controller
public class IndexController {
	
	
	//private MiServicio servicio = new MiServicio();
	@Autowired
	private IMiServicio servicio;
	
	@GetMapping({"/index", "/", ""})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

}
