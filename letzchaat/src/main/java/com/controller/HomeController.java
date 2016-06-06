package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView m=new ModelAndView("index");
		return m;
	}
	@RequestMapping("/index")
	public ModelAndView home1()
	{
		ModelAndView m=new ModelAndView("index");
		return m;
	}
	@RequestMapping("/signin")
	public ModelAndView signin()
	{
		ModelAndView m=new ModelAndView("signin");
		return m;
	}
	
}
