package com.vijendra.project1;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A4Controller {
	@RequestMapping("company")
	public A4 company()
	{
		ArrayList<String> list = new ArrayList<String>();
		A4 obj = new A4();
		obj.setComRegistration(1014);
		obj.setComName("Lara tech");
		obj.setComType("software company");
		obj.setComAdd("Bangalore");
		obj.setComMobile("9198691996");
		obj.setComEmail("lara@gmail.com");
		list.add("vijendra");
		list.add("lara");
		list.add("virat");
		obj.setComEmployees(list);
		return obj;
	}
	
	
	
	@RequestMapping("A4/softCompany")
	public A4 softCompany(@RequestBody A4 softCompany)
	{
		System.out.println("-----------------------");
		System.out.println("Comapny Registration code : " + softCompany.getComRegistration());
		System.out.println("Company Name : " + softCompany.getComName());
		System.out.println("Company Type : " + softCompany.getComType());
		System.out.println("Company Address : " + softCompany.getComAdd());
		System.out.println("Company Contact Numbers : " + softCompany.getComMobile());
		System.out.println("Company Email Id : " + softCompany.getComEmail());
		System.out.println("Company's Employees list : " + Arrays.asList(softCompany.getComEmployees()));
		return softCompany;
		
	}
}
