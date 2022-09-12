package com.collegeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.collegeapp.model.Address;
import com.collegeapp.model.College;
import com.collegeapp.model.Department;
import com.collegeapp.service.IAddressService;
import com.collegeapp.service.ICollegeService;
import com.collegeapp.service.IDepartmentService;
import com.collegeapp.service.IUniversityService;

@SpringBootApplication
public class SpringRestApiCollegeappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiCollegeappApplication.class, args);
	}

	@Autowired
	IUniversityService universityService;
	@Autowired
	ICollegeService collegeService;
	@Autowired
	IAddressService addressService;
	@Autowired
	IDepartmentService departmentService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Address address=new Address("MG circle","karnataka","bangalore");
//		addressService.addAddress(address);
//		
		
//		College college =new College("acharya", null, address, null);
//		Set<College> colleges=new HashSet<>(Arrays.asList(college));
	
		Department department =new Department("computer science","HOD");
		departmentService.addDepartment(department);
		
	}

}
