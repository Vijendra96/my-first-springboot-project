package com.vijendra.project1;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A3Controller {
//	@RequestMapping("A3")
//	public A3 test()
//	{
////		A3 ref = new A3();
////		ref.setId[10];
////		ref.setFirstName["vijendra"];
////		return ref;
//	}
	
	@RequestMapping("A3/employee")
	public A3 lara(@RequestBody A3 employee)
	{
		System.out.println("from A2/emp");
		System.out.println(Arrays.toString(employee.getId()));
		System.out.println(Arrays.toString(employee.getFirstName()));
		System.out.println(Arrays.toString(employee.getSecondName()));
		System.out.println(Arrays.toString(employee.getAddress()));
		System.out.println(Arrays.toString(employee.getSalary()));
		System.out.println(Arrays.toString(employee.getMobile()));
		return employee;
	}
}
	
	

