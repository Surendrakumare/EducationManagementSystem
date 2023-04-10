package com.sysfore.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sysfore.demo.controller.service.EducationInterface;

@RestController
public class ControllerClass {
	@Autowired
	private EducationInterface edu;
	
	
	
	@PostMapping("/adding-student-details")
	public String 
	

}
