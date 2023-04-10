package com.sysfore.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sysfore.demo.controller.service.EducationInterface;
import com.sysfore.demo.educationSitedto.StudentDetailsdto;

import jakarta.validation.Valid;

@RestController
public class ControllerClass {
	@Autowired
	private EducationInterface edu;
	
	
	
	@PostMapping("/adding-student-details")
	public String addStudentDetails(@Valid@RequestBody StudentDetailsdto student)
	{
		return edu.addStudentDetails(student);
	}
	

}
