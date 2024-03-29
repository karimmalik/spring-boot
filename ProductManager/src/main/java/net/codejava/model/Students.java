package net.codejava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
//	private String passportNumber;
	
	public Students() {
		super();
	}

	public Students(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
//		this.passportNumber = passportNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getPassportNumber() {
//		return passportNumber;
//	}
//
//	public void setPassportNumber(String passportNumber) {
//		this.passportNumber = passportNumber;
//	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", passportNumber=" + "]";
	}

	
	
}