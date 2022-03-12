package com.vijendra.project1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Project1Application {

	public static void main(String[] args) {
		System.out.println("starting ...");
		SpringApplication.run(Project1Application.class, args);
		System.out.println("started ...");
	}
	
	@RequestMapping("test")
	public String test()
	{
		System.out.println("Hi! I am from string test() ...");
		return "Hello! and welcome to the springboot";
	} //	http://localhost:9090/test
	
	
	@RequestMapping("xyz")
	public int xyz()
	{
		System.out.println("Hi! I am from int xyz()");
		return 100;
	}//	http://localhost:9090/xyz
	
	
	@RequestMapping("abc")
	public boolean abc()
	{
		System.out.println("I am from boolean abc()");
		return true;
	}//	http://localhost:9090/abc
	
	
	@RequestMapping("pqr")
	public char pqr()
	{
		System.out.println("I am from char pqr()");
		return 'a';
	}//	http://localhost:9090/pqr
	
	
	@RequestMapping("abcd")
	public double abcd()
	{
		System.out.println("I am from double abcd()");
		return  10.0;
	}//	http://localhost:9090/abcd
	
	@RequestMapping("jkl")
	public float jkl()
	{
		System.out.println("I am from float jkl()");
		return 2.5f;
	}//	http://localhost:9090/abcd
	
	@RequestMapping("mno")
	public short mno()
	{
		System.out.println("I am from short mno()");
		return 21111;
	}//	http://localhost:9090/mno

	
	@RequestMapping("tuv")
	public byte tuv()
	{
		System.out.println("I am from byte tuv()");
		return 55;
	}//	http://localhost:9090/mno
	
	@RequestMapping("file")
	public void fileReader() throws Exception {
		FileReader fin = new FileReader("person.txt");
		BufferedReader bin = new BufferedReader(fin);
		String s1 = bin.readLine();
		char[]chars = s1.toCharArray();
		System.out.println(chars.toString());
		int count = 0;
		while(s1 != null)
		{
			count ++;
			System.out.println(s1);
			s1 = bin.readLine();
		}
		System.out.println("\nthe total lines are : " + count);
		System.out.println("\n" + Arrays.toString(chars));
	}
	
	@RequestMapping("personDetails")
	public void personDetails() throws Exception
	{
		FileReader fin = new FileReader("person.txt");
		BufferedReader bin = new BufferedReader(fin);
		Person person;
		ArrayList list = new ArrayList();
		String s1 = bin.readLine();
		String[] words;
		while(s1 != null)
		{
			person = new Person();  //ramesh b 38 BTM
			words = s1.split(" ");
			person.firstName = words[0];
			person.lastName = words[1];
			person.age = Integer.parseInt(words[2]);
			person.address = words[3];
			person.mobile = words[4];
			person.email = words[5];
			list.add(person);
			s1 = bin.readLine();
		}
		//read person object from an ArrayList
		for(Object obj : list)
		{
			person = (Person) obj;
			System.out.println("\n\b" + person.firstName + "  " + person.lastName + "  " + person.age + "  " + person.address + "  " + person.mobile + "  " + person.email);
		
		}
	}

}
