package com.project.nubeera;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.nubeera.MedicureService;

@SpringBootTest
class MedicureApplicationTests {

	@Autowired
	MedicureService doctorService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testService() {
	  assertEquals(doctorService.greetingFromDoctor(), "Welcome from Doctor Saad");
	}
}
