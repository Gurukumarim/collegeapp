package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.University;
@Repository
public interface IUniversityRepository extends JpaRepository<University, Integer>{

	
	List<University> findAll();
	
//	void addUniversity(String university);
//	void updateUniversity(String university);
//	void deleteUniversity(int universityId);
}
