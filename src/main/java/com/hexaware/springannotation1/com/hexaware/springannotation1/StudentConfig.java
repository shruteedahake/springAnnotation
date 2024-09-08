package com.hexaware.springannotation1.com.hexaware.springannotation1;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
	
	@Bean(name="stud1", initMethod="init", destroyMethod="destroy")
	public Student getStudent() {
		Student s1=new Student();
		s1.setRoll(101);
		s1.setName("Shrutee");
		s1.setFee(50000.00);
		return s1;
	}
	
	@Bean(name="stud2")
	public Student getStudent2() {
		Student s2=new Student();
		s2.setRoll(102);
		s2.setName("Tanay");
		s2.setFee(1500.50);
		return s2;
	}
	
	@Bean(name="res")
	public Result getResult() {
		Result r=new Result();
		r.setMarks(99);
		r.setRemarks("Pass");
		return r;
	}
	
	@Bean(name="res2")
	public Result getResult2() {
		Result r2=new Result();
		r2.setMarks(19);
		r2.setRemarks("Fail");
		return r2;
	}

}
