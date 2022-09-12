package com.collegeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class College {
	@Id
	@GeneratedValue(generator = "college_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="college_id",sequenceName = "college_id",allocationSize = 1,initialValue = 10)
	private String collegeName;
	private Integer collegeId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id")
	private Set <Department> departments;
	
	@OneToOne()
	@JoinColumn(name="college_id")
	private Address address;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="college_id")
	private University university;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collegeName, Set<Department> departments, Address address, University university) {
		super();
		this.collegeName = collegeName;
		this.departments = departments;
		this.address = address;
		this.university = university;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", university=" + university + "]";
	}
	
	
	
}
