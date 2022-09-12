package com.collegeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.model.College;
import com.collegeapp.repository.ICollegeRepository;

@Service
public class CollegeServiceImpl implements ICollegeService{
	
	@Autowired
   ICollegeRepository collegeRepository;

	@Override
	public void addCollege(College college) {
		collegeRepository.save(college);
		
	}

	@Override
	public void updateCollege(College college) {
		collegeRepository.save(college);
		
	}

	@Override
	public void deleteCollegeId(int collegeId) {
		collegeRepository.deleteById(collegeId);
		
	}

}
