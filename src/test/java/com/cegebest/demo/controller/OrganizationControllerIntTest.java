//package com.cegebest.demo.controller;
//
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//
////@ExtendWith(SpringExtension.class)
////@WebMvcTest(controllers = OrganizationController.class)
//@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//public class OrganizationControllerIntTest {
//
//	@Autowired
//	private MockMvc mvc;
////
//	@Test
//	public void testOrganizationControllerResponseAtStart() throws Exception {
////		 building the Http request
//
//		RequestBuilder request = MockMvcRequestBuilders.get("/organization");
//		// sending the request and getting the response back
//		ResultActions result = mvc.perform(request);
////		String x = result.getResponse().getContentAsString();
////		System.out.println("the X is " + x);
//		result.andExpect(MockMvcResultMatchers.status().isOk());
//		assertEquals(result.andReturn().getResponse().getContentAsString(), "[]");
//	}
//
//	public void testOrganizationControllerResponseDataAtStart() {
////		RequestBuilder request = MockMvcRequestBuilders.post("/organization")
////				.contentType(MediaType.APPLICATION_JSON_VALUE)
////				 todo: add fasterxml jackson dependency
////				.content();
//	}
//}
