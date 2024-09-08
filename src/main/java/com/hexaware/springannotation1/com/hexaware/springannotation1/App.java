package com.hexaware.springannotation1.com.hexaware.springannotation1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context= new AnnotationConfigApplicationContext();
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student s=(Student)context.getBean("stud1");
    	System.out.println(s.toString());
    	Result r=s.getRes();
    	System.out.println(r);
    	
    	Student s2=(Student)context.getBean("stud2");
    	System.out.println(s2.toString());
    	Result r2=s2.getRes2();
    	System.out.println(r2);
    	
    	context.close();
    }
}
