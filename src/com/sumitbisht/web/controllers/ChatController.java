package com.sumitbisht.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatController {
	
	@RequestMapping(value = { "/index.html" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView showHome(){
		ModelAndView mainPage = new ModelAndView("index");
		return mainPage;	
	}

}
