package com.collegeapp.service;

import com.collegeapp.model.College;

public interface ICollegeService {
	

	void addCollege(College college);
	void updateCollege(College college);
	void deleteCollegeId(int collegeId);
	
//	void addCollege(College college)throws collegeNotFoundException;
//	void updateCollege(College college)throws collegeNotFoundException;
//	void deleteCollegeId(int collegeid)throws collegeNotFoundException;
//	
//   void getById(int collegeId );//collegeNotFoundException;
//
//    void getByCity(String city);//collegeNotFoundException;
  }
 