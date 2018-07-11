package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String displayName() {
		return "home";
	}
	
	@GetMapping("/name")
	public String getName(Model model, @RequestParam("name") String name) {
		model.addAttribute("name", name);
		return"name";
	}
	
}
