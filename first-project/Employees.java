package com.vijendra.project1;

public class Employees {
	private Integer empId;
	private String firstName;
	private String lastName;
	private String[] empSkills;
	private Integer empSalary;
	private Address empPermanentAddress;
	private ContactNumbers empMobileNumbers;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
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
	public String[] getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(String[] empSkills) {
		this.empSkills = empSkills;
	}
	public Integer getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Integer empSalary) {
		this.empSalary = empSalary;
	}
	public Address getEmpPermanentAddress() {
		return empPermanentAddress;
	}
	public void setEmpPermanentAddress(Address empPermanentAddress) {
		this.empPermanentAddress = empPermanentAddress;
	}
	public ContactNumbers getEmpMobileNumbers() {
		return empMobileNumbers;
	}
	public void setEmpMobileNumbers(ContactNumbers empMobileNumbers) {
		this.empMobileNumbers = empMobileNumbers;
	}
	
}
