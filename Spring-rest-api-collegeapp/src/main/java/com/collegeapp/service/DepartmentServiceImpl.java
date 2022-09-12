package com.collegeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.model.Department;
import com.collegeapp.repository.IDepartmentRepository;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
	
	
	@Autowired
	IDepartmentRepository departmentRepository;

	@Override
	public void addDepartment(Department department) {
		departmentRepository.save(department);
		
	}

	@Override
	public void updateDepartment(Department department) {
		departmentRepository.save(department);
		
	}

	@Override
	public void deleteDepartmentId(int departmentid) {
		departmentRepository.deleteById(departmentid);
		
	}

}
