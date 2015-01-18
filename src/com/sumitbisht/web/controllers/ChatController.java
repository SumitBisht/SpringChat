package com.sumitbisht.web.controllers;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import com.sumitbisht.web.model.User;

@Controller
public class ChatController {

	@RequestMapping(value = { "/" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView showHome(){
		ModelAndView mainPage = new ModelAndView("index");
		return mainPage;	
	}
	
	@RequestMapping(value = { "/login" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView handleLogin(){
		ModelAndView loginForm = new ModelAndView("login-form");
		loginForm.getModelMap().put("user", new User());
		return loginForm;
	}
	@RequestMapping(value = { "/processlogin" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	public ModelAndView ProcessFormData(@ModelAttribute("user") User user, BindingResult result, ModelMap model, Locale locale) throws Exception{
		System.out.println("result: "+user.toString());
		ModelAndView userPage = new ModelAndView("userDetailsPage");
		userPage.getModelMap().put("user", user);
		return userPage;	
	}

}
