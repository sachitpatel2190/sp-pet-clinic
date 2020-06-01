package com.sachit.learn.sppetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sachit.learn.sppetclinic.services.VetService;

@Controller
@RequestMapping("/vets")
public class VetsController {
	
	VetService vetService;
	
	public VetsController(VetService vetService) {
		this.vetService = vetService;
	}
	
	@RequestMapping({"","/", "/index"})
	public String listVets(Model model){
		

		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
