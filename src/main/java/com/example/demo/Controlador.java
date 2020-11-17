package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("mensaje", "Hola Daniel");
		return "/User";
	}
}