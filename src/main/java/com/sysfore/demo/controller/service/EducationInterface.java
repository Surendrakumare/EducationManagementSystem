package com.sysfore.demo.controller.service;

import com.sysfore.demo.educationSitedto.StudentDetailsdto;

import jakarta.validation.Valid;

public interface EducationInterface {

	String addStudentDetails(@Valid StudentDetailsdto student);

}
