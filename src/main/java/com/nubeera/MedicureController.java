package com.nubeera;

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

	@GetMapping("/hi")
	public String sayHello() {
		return "Greeting from Dr.Mujahed";
	}

	@GetMapping("/listAllDoctors")
	public Doctor listAllDoctors() {
		return doctorService.listAllDoctors();
	}

	@GetMapping("/getDoctor/{doctorRegistrationId}")
	public Doctor getDoctor(@PathVariable String doctorRegistrationId) {
		return doctorService.getDoctorDetails(doctorRegistrationId);
	}

		
	@PostMapping("/registerDoctor")
	public Doctor registerDoctor(@RequestBody Doctor doctor) {
		return doctorService.registerDoctor(doctor);
	}
}