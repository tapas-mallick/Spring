package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean(name= {"1","2"})
	public Student tapas() {
		Student stu = new Student();
		return stu;
	}

}
