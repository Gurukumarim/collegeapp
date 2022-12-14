package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.Department;
@Repository
public interface IDepartmentRepository  extends JpaRepository<Department, Integer>{
	
	List<Department> findAll();

}
