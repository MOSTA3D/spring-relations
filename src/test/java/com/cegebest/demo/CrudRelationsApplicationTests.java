package com.cegebest.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrudRelationsApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("hello from test ");
	}

	@Test
	void helloTest() {
		System.out.println("hello from test ");
		assertEquals("shak", "shak");

	}
}
