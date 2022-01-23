package com.tss.springjwt.model;

public class MyObject {
	private String firstName;
	private String lastName;
	private String role;
	private String email;

	public MyObject() {
		// TODO Auto-generated constructor stub
	}

	public MyObject(String firstName, String lastName, String role, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.email = email;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
