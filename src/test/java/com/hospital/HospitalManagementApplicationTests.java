package com.hospital;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.hospital.models.Doctor;
import com.hospital.models.Patient;
import com.hospital.repositories.DoctorRepository;
import com.hospital.repositories.PatientRepository;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;


    @RunWith(SpringRunner.class)
	@SpringBootTest
	class HospitalManagementApplicationTests{

		@Autowired
		DoctorRepository dRepository;
		@Autowired
		PatientRepository pRepository;
		Doctor doctor;
		
		Patient patient;
		
		@BeforeEach
		void setUpForDoctor()
		{
			doctor=new Doctor();
			doctor.setId((long) 123);
			doctor.setFirstName("Anil");
			doctor.setLastName("Singh");
			doctor.setEmailId("Amitsingh@gmail.com");
			doctor.setAge(21);
			doctor.setGender("male");
			doctor.setSpeciality("nuro sergion");
		}   
		
		@Test
		void test1() {
			assertNotNull(dRepository.findById((long) 123));
		}
		
		@Test
		void test2()
		{
			assertNotNull(dRepository.save(doctor));
		}
		
		
		@Test
		void test3()
		{
			assertNotNull(pRepository.findById((long)1555));
		}
		
		
   }

