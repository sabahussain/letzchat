package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.model.Register;
import com.service.RegisterService;

import java.util.*;


@Controller
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String index(@ModelAttribute("r")Register r,BindingResult result, Model model) {  
	    List<String> usertype = new ArrayList<String>();
	    usertype.add("STUDENT");
	    usertype.add("ALUMNI");
	    registerService.addUser(r);
	    model.addAttribute("user",r);
	    System.out.println(r);
	    model.addAttribute("userType", usertype);
	    return "signup";
	}

	/*@RequestMapping(value = "test", method = RequestMethod.POST)
	public String test(@RequestParam String selectedString, Model model) {
	    System.out.println(selectedString);
	    return "signup";
	}*/
	

}
