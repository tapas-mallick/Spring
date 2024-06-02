package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		Student stu=context.getBean("student",Student.class);
		
		System.out.println(stu);
		
		SpelExpressionParser sp= new SpelExpressionParser();
		org.springframework.expression.Expression temp= sp.parseExpression("100+23");
		System.out.println(temp.getValue());
	}

}
