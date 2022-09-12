package com.collegeapp.service;

import com.collegeapp.model.Address;

public interface IAddressService {

	
	void addAddress(Address address);
	void updateAddress(Address address);
	void deleteAddressId(int addressid);
	
	
	
//	void addCollege(College college)throws collegeNotFoundException;
//	void updateCollege(College college)throws collegeNotFoundException;
//	void deleteCollegeId(int collegeid)throws collegeNotFoundException
//}
}