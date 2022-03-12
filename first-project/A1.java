package com.vijendra.project1;

import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class A1 {
	
	
	
	@RequestMapping("v1/firstName/{s1}/lastName/{s2}")
	public String v1(@PathVariable String s1, @PathVariable String s2)
	{
		String s3 = s1 + " " + s2;
		System.out.println("output : " + s3);
		return s3;
	}
	
	@RequestMapping("v2/name/{name}/age/{age}")
	public String v2(@PathVariable String name, @PathVariable Integer age)
	{
		String s3 = "name : "  + name + " and is : " + age;
		System.out.println(s3);
		return s3;
	}	// http://localhost:9090/v2/name/vijendra/age/25
	
	
	
	
	@RequestMapping("v3/{a1}/{a2}")
	public String v3(@PathVariable(name = "a1") String lastName, @PathVariable(name = "a2") Integer age)
	{
		String s3 = "name : "  + lastName + " and is : " + age;
		System.out.println(s3);
		return s3;
	}	// http://localhost:9090/v3/kharwar/25
	
	
	@RequestMapping("v4/{a1}/{a2}")
	public String v4(@PathVariable(value = "a1") String lastName, @PathVariable(value = "a2") Integer age)
	{
		String s3 = "name : "  + lastName + " and is : " + age;
		System.out.println(s3);
		return s3;
	}	// http://localhost:9090/v4/kharwar/25
	
	@RequestMapping("v5/firstName/{s1}/lastName/{s2}/age/{age}")
	public String h5(@PathVariable String s1, @PathVariable String s2, @PathVariable Integer age)
	{
		String str = "my name is : " + s1 + " " + s2 + " and I am " + age + " years old ";
		System.out.println(str);
		return str;
	}
		//			http://localhost:9090/v5/firstName/vijendra/lastName/kharwar/age/25
	
	
	@RequestMapping("v6/{s1}/{s2}/{age}")
	public String h6(@PathVariable(value = "s1") String s1, @PathVariable(value = "s2") String s2, @PathVariable(value = "age") Integer age)
	{
		String str = "First name : " + s1;
		String str1 = "Last Name : " + s2 ;
		String age2 = "Age : " + age;
		System.out.println(str);
		System.out.println(str1);
		System.out.println(age2);
		return ("\n" + str + "\n" + str1 + "\n" + age2);
	}
		//			http://localhost:9090/v6/vijendra/kharwar/25
	
	
	@RequestMapping("v7/{s1}")
	public String v7(@PathVariable String[] s1)
	{
		String str = Arrays.toString(s1);
		System.out.println(str);
		return str;
	}
		//			http://localhost:9090/v7/vijendra,kharwar,25
}
