package com.sachit.learn.sppetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetsController {
	
	
	@RequestMapping({"","/", "/index"})
	public String listVets(){
		return "vets/index";
	}

}
