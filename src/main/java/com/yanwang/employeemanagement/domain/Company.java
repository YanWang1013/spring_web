package com.yanwang.employeemanagement.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity // This tells Hibernate to create a table of this class
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//	By @GeneratedValue, JPA makes a unique key automatically and applies the key to the field having @Id
	private long id;

	@NotEmpty(message = "The company name cannot be empty.")
	@Length(min = 3, max = 50, message = "Size must be between 3 and 50")
	private String companyName;

	@NotEmpty(message = "The address cannot be empty.")
	@Length(min = 5, max = 50, message = "Size must be between 5 and 50")
	private String address;

	@OneToMany
	private List<Employee> employees;

	public Company() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getEmployees(){
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
