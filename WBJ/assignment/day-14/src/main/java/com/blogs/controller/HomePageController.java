package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //mandatory, it represent a spring bean containing HTTPrequest handling logic       
//singleton n eager
public class HomePageController {
	public HomePageController() {
		System.out.println("In constructor " + getClass());
	}
	//Add request handling method to render the index page
	//URL - http://host:port/ctx_path/
	@RequestMapping("/") //to specify request handling method - like service
	public String renderHomePage() {
		System.out.println("In render home page");
		return "/index"; //LVN - Logical View Name
	}
}
