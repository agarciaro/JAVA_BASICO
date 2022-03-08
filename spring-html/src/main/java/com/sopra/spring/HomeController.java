package com.sopra.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@Value("${sopra.welcome-message}")
	String message;
	
	List<String> colores = Arrays.asList(new String[] {"rojo", "verde", "azul", "negro"});
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("mensaje", message);
		
		return "home";
	}
	
	@GetMapping("/lista")
	public String lista(Model model) {
		model.addAttribute("colores", colores);
		
		return "lista";
	}
	
	@GetMapping("/maqueta")
	public String maqueta() {
		return "maquetacion";
	}
}
