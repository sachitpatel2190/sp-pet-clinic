package com.sachit.learn.sppetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sachit.learn.sppetclinic.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

	OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	
	@RequestMapping({"","/", "/index"})
	public String listOwners(Model model){
		
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

}
