package com.collegeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.model.Address;
import com.collegeapp.repository.IAddressRepository;

@Service
public class AddressServiceImpl implements IAddressService{
	@Autowired
	IAddressRepository addressRepository;

	@Override
	public void addAddress(Address address) {
		addressRepository.save(address);
		
	}

	@Override
	public void updateAddress(Address address) {
		addressRepository.save(address);
	
		
	}

	@Override
	public void deleteAddressId(int addressid) {
		addressRepository.deleteById(addressid);
		
	}

}
