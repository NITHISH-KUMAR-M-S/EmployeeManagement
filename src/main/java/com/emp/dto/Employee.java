package com.emp.dto;

public class Employee {
	private String eId;
	private String ename;
	private String email;
	private long phone;
	private double salary;
	private String company;


	
	public Employee(String eId, String ename, String email, long phone, double salary, String company) {
		super();
		this.eId = eId;
		this.ename = ename;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.company = company;
	}

	public Employee() {
		
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
