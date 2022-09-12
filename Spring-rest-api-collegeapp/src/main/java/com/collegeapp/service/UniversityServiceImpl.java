package com.collegeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.repository.IUniversityRepository;
@Service
public class UniversityServiceImpl implements IUniversityService{
	
	@Autowired
	IUniversityRepository universityRepository;

	@Override
	public void addUniversity(String university) {
		
		
	}

	@Override
	public void updateUniversity(String university) {
		
		
	}

	@Override
	public void deleteUniversity(int universityId) {
		universityRepository.deleteById(universityId);
		
	}

}
