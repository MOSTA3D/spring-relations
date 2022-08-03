package com.cegebest.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cegebest.demo.ui.service.ProjectService;

public class ServicesTest {
	@Autowired
	private ProjectService projectService;
	@Test
	public void projectServiceTest() {
		try {
			projectService.getOne(Long.valueOf(0));
		}catch(Exception e) {
			System.out.println("from project test service catch");
			System.out.println(e.getMessage());
		}
	}
}
