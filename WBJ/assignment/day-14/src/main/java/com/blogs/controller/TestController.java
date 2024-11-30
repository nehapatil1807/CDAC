package com.blogs.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //mandatory
@RequestMapping ("/test") //optional but recommended
public class TestController {
	public TestController() {
		System.out.println("In contructor " + getClass());

	}
	@GetMapping("/test1")
	public ModelAndView testModelAndView() {
		System.out.println("In test model n view");
		return new ModelAndView("/test/test1", "time_stamp", LocalDateTime.now()); //AVN-/WEB-INF/views/test/test1.jsp          
	
	}
	@GetMapping("/test2")
	public String testModelMap(Model modelMap) {
		System.out.println("In test model map" + modelMap);
		modelMap.addAttribute("time_stamp", LocalDateTime.now()).addAttribute("number_list", List.of(10,20,30,40));
		System.out.println("In test model map " + modelMap);
		return "/test/test2";
	
	
	
	}
}
