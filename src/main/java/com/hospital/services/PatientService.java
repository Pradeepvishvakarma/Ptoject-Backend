package com.hospital.services;

import org.springframework.stereotype.Service;

import com.hospital.models.Patient;
@Service
public interface PatientService {
	 Patient addPatientToDoctor(Patient patient, long id);
	 

}
