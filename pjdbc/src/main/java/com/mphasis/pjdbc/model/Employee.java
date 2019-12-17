package com.mphasis.pjdbc.model;

public class Employee {

	private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public Employee(long id, String firstName, String lastName, String emailAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    
	
	

	
	
	
	
}
