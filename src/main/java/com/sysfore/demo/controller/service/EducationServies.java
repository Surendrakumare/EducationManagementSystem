package com.sysfore.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sysfore.demo.repository.RepositoryInterface;

public class EducationServies implements EducationInterface {
	@Autowired
private RepositoryInterface repo;
}
