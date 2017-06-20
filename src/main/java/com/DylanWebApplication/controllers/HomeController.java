package com.DylanWebApplication.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/site")
	public ModelAndView home(HttpServletRequest request, ModelMap modelMap) {
		logger.info("Made it to your site");
		
		return new ModelAndView("site");
		
	}

}
