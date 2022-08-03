package com.cegebest.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cegebest.demo.ui.controller.ProjectController;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProjectController.class)
public class ProjectControllerIntTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testProjectController() throws Exception {
		// building the Http request
		RequestBuilder request = MockMvcRequestBuilders.get("/project");
		
		// sending the request and getting the response back
		MvcResult result = mvc.perform(request).andReturn();
		String x = result.getResponse().getContentAsString();
		System.out.println("the X is " + x);
		assertEquals("[]", x);
		
	}
	
}
