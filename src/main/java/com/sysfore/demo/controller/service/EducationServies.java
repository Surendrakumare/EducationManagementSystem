package com.sysfore.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sysfore.demo.educationSitedto.StudentDetailsdto;
import com.sysfore.demo.repository.RepositoryInterface;

import jakarta.validation.Valid;

public class EducationServies implements EducationInterface {
	@Autowired
private RepositoryInterface repo;

	@Override
	public String addStudentDetails(@Valid StudentDetailsdto student) {
		
		return repo.addStudentDetail(student);
	}
}
