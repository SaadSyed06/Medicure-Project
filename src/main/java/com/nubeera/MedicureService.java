package com.project.nubeera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicureService {
	
	@Autowired
	MedicureRepository doctorRepository;
	
	public Doctor registerDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctors() {
		Doctor doctor = new Doctor("MP1110","Saad","Neurologist","15 Years");
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctorDetails(String doctorRegistrationId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorRegistrationId).get();
	}
	
	public Doctor registerDummyDoctor() {
		Doctor doctor = new Doctor("MP1110","Saad","Neurologist","15 Years");
		return doctor;
	}
	
	public String greetingFromDoctor() {
		return "Welcome from Doctor Saad";
	}

}
