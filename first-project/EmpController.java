package com.vijendra.project1;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@RequestMapping("employeeDetails")
	public Employees employeeDetails(@RequestBody Employees emp)
	{
		System.out.println("-------------------------------");
		System.out.println("Employee's Id : " + emp.getEmpId());
		System.out.println("Employee's First Name : " + emp.getFirstName());
		System.out.println("Employee's Last Name : " + emp.getLastName());
		System.out.println("Employee's Skills list : " + Arrays.toString(emp.getEmpSkills()));
		System.out.println("Employee's Salary : " + emp.getEmpSalary());
		System.out.println("Employee's House Number : " + emp.getEmpPermanentAddress().getHouseNo());
		System.out.println("Employee's Street Number : " + emp.getEmpPermanentAddress().getStreetName());
		System.out.println("Employee's Mobile Number : " + emp.getEmpMobileNumbers().getPersonalMobleNo());
		System.out.println("Employee's House Contact Number : " + emp.getEmpMobileNumbers().getHomeMobileNo());
		return emp;
		
	}
	
	@RequestMapping("empData")
	public Employees empData()
	{
		Employees emp = new Employees();
		emp.setEmpId(1000);
		emp.setFirstName("vinu");
		emp.setLastName("A.");
		String[] skills = {"c++", "python","sql"};
		emp.setEmpSkills(skills);
		emp.setEmpSalary(12455);
		Address add = new Address();
		add.setHouseNo("SL73");
		add.setStreetName("Saidapur");
		emp.setEmpPermanentAddress(add);
		ContactNumbers contactNo = new ContactNumbers();
		contactNo.setPersonalMobleNo("9198691996");
		contactNo.setHomeMobileNo("9742036461");
		emp.setEmpMobileNumbers(contactNo);
		return emp;
		
	}
}
