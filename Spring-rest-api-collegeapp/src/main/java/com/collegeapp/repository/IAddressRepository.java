package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeapp.model.Address;
@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer>{
	
	List<Address> findAll();

}
