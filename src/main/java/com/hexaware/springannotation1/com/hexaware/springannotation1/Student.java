package com.hexaware.springannotation1.com.hexaware.springannotation1;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int Roll;
	String Name;
	Double Fee;
	
	@Autowired
	Result res;
	
	@Autowired
	Result res2;
	
	public Result getRes2() {
		return res2;
	}

	public void setRes2(Result res2) {
		this.res2 = res2;
	}

	public Result getRes() {
		return res;
	}

	public void setRes(Result res) {
		this.res = res;
	}

	Student(){
		
	}
	
	public Student(int roll, String name, Double fee) {
		super();
		Roll = roll;
		Name = name;
		Fee = fee;
	}

	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getFee() {
		return Fee;
	}
	public void setFee(Double fee) {
		Fee = fee;
	}
	
	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", Name=" + Name + ", Fee=" + Fee + "]";
	}
	
	// init method is called before the object creation
	void init() {
		System.out.println("Before object creation");
	}
	
	// destory is called after the object is destroyed
	void destroy() {
		System.out.println("After finishing object");
	}
}
