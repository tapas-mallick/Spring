package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student=context.getBean("1",Student.class);
		student.tapas();
		System.out.println(student.getName());
		System.out.println(student.getAddress());

	}

}
