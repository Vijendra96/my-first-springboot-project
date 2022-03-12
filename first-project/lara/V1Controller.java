package com.vijendra.project1.lara;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vijendra.project1.A2;
@RestController
public class V1Controller {
	@RequestMapping(path = "lara", method = RequestMethod.GET)
	//@RequestMapping(path = "lara", method = RequestMethod.DELETE)
	public A2 emp()
	{
		A2 obj = new A2();
		obj.setEmpId(100);
		obj.setEmpName("vijendra");
		obj.setEmpAge(26);
		obj.setEmpAddress("sammerwadi");
		obj.setEmpSalary(30000);
		//System.out.println(obj);
		return obj;
	}
	
	
	//@RequestMapping("V1/A2A")
	//@RequestMapping(path = "V1/A2A", method = RequestMethod.POST)
	@RequestMapping(path = "V1/A2A", method = RequestMethod.DELETE)
	public A2 emp1(@RequestBody A2 emp)
	{
		System.out.println("from emp");
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAge());
		System.out.println(emp.getEmpAddress());
		System.out.println(emp.getEmpSalary());
		return emp;
	}
}
