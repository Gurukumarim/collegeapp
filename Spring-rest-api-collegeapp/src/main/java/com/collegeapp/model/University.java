package com.collegeapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class University {
	@Id
	@GeneratedValue(generator = "university_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="university_id",sequenceName ="university_id",allocationSize = 1,initialValue = 10)
	private String universityName;
	private Integer universityId;
	private String universityCity;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="university_id")
	private Set<College> colleges;

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}

	public University(String universityName, String universityCity, Set<College> colleges) {
		super();
		this.universityName = universityName;
		this.universityCity = universityCity;
		this.colleges = colleges;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Integer getUniversityId() {
		return universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public String getUniversityCity() {
		return universityCity;
	}

	public void setUniversityCity(String universityCity) {
		this.universityCity = universityCity;
	}

	public Set<College> getColleges() {
		return colleges;
	}

	public void setColleges(Set<College> colleges) {
		this.colleges = colleges;
	}

	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", universityCity=" + universityCity + "]";
	}
	
	
	

}
