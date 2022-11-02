package com.yanwang.employeemanagement.domain;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity // This tells Hibernate to create a table of this class
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//	By @GeneratedValue, JPA makes a unique key automatically and applies the key to the field having @Id
	private long id;

	@NotEmpty(message = "The first name cannot be empty.")
	@Length(min = 3, max = 50, message = "Size must be between 3 and 50")
	private String firstName;

	@NotEmpty(message = "The last name cannot be empty.")
	@Length(min = 3, max = 50, message = "Size must be between 3 and 50")
	private String lastName;

	@NotEmpty(message = "The email cannot be empty.")
	@Email(message = "Invalid email format.")
	@Length(min = 10, max = 250, message = "Size must be between 10 and 250")
	private String email;

	@NotNull(message = "The company cannot be empty.")
	@ManyToOne
	@JoinColumn
	private Company company;

	public Employee() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
