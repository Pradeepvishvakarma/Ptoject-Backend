package com.hospital.services;

import org.springframework.stereotype.Service;

import com.hospital.models.Doctor;
@Service
public interface DoctorService {
	Doctor addDoctor(Doctor doctor, long id);

}
