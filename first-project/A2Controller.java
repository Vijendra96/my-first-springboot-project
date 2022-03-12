package com.vijendra.project1;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A2Controller 
{
		@RequestMapping("A2")
		public A2 emp()
		{
			A2 obj = new A2();
			obj.setEmpId(100);
			obj.setEmpName("vijendra");
			obj.setEmpAge(26);
			obj.setEmpAddress("sammerwadi");
			obj.setEmpSalary(30000);
			return obj;
		}
		
		
		@RequestMapping("A2A")
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
