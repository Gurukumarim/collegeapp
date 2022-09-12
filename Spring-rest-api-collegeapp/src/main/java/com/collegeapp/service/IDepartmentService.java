package com.collegeapp.service;

import com.collegeapp.model.Department;

public interface IDepartmentService {
	
	
	void addDepartment(Department department);
	void updateDepartment(Department department);
	void deleteDepartmentId(int departmentid);
	
	
//	void addCollege(College college)throws collegeNotFoundException;
//	void updateCollege(College college)throws collegeNotFoundException;
//	void deleteCollegeId(int collegeid)throws collegeNotFoundException

}
