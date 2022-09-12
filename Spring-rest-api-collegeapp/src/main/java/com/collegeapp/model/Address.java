package com.collegeapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@GeneratedValue(generator = "address_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="address_id",sequenceName = "address_id",allocationSize = 1,initialValue = 10)
	private Integer addressId;
	private String addressCity;
	private String addressState;
	private String addressLocation;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String addressCity, String addressState, String addressLocation) {
		super();
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressLocation = addressLocation;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressLocation() {
		return addressLocation;
	}

	public void setAddressLocation(String addressLocation) {
		this.addressLocation = addressLocation;
	}

	@Override
	public String toString() {
		return "Address [addressCity=" + addressCity + ", addressState=" + addressState + ", addressLocation="
				+ addressLocation + "]";
	}


	
}
