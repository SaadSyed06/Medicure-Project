package com.project.nubeera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicureController {
	@Autowired
	MedicureService doctorService;
	/********************/
	/** GET HTTP VERBS **/
	/********************/
	@GetMapping("/hi")
	public String hiFromDoctor() {
		return "Simple Message";
	}

	@GetMapping("/greet")
	public String greetingFromDoctor() {
		return doctorService.greetingFromDoctor();
	}

	@GetMapping("/getDoctors")
	public Doctor getDoctors() {
		return doctorService.getDoctors();
	}
		
	@GetMapping("/getDoctor/{doctorRegistrationId}")
	public Doctor getDoctor(@PathVariable String doctorRegistrationId) {
		return doctorService.getDoctorDetails(doctorRegistrationId);
	} 

	/*********************/
	/** POST HTTP VERBS **/
	/*********************/
	@PostMapping("/registerDummyDoctor")
	public Doctor registerDummyDoctor() {
		return doctorService.registerDummyDoctor();
	}

	@PostMapping("/registerDoctor")
	public Doctor registerDoctor(@RequestBody Doctor doctor) {
		return doctorService.registerDoctor(doctor);
	}
}
