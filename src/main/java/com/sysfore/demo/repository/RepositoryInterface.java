package com.sysfore.demo.repository;

import com.sysfore.demo.educationSitedto.StudentDetailsdto;

import jakarta.validation.Valid;

public interface RepositoryInterface {

	public String addStudentDetail(@Valid StudentDetailsdto student); 
}
