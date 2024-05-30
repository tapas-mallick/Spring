package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	// 3 ways to implement lifecycle methods (xml,interfaces,annotations)

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
		LifecycleTest test = (LifecycleTest) context.getBean("Test");
		System.out.println(test);
		// Registered shutdown hook
		context.registerShutdownHook();

		System.out.println("----------------------------------------");

		LifecycleTest1 test1 = (LifecycleTest1) context.getBean("Test1");
		System.out.println(test1);

		System.out.println("----------------------------------------");

		LifecycleTest2 test2 = (LifecycleTest2) context.getBean("Test2");
		System.out.println(test2);

	}

}
