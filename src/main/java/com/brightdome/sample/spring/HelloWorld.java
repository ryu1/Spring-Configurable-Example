package com.brightdome.sample.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	
	public static void main(String[] args) {
		// Initialize Spring Context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/applicationContext.xml" );
		for (String beenName : context.getBeanDefinitionNames()) {
			System.out.println("beenName="+beenName);
		}
		// Instantiate class by new'ing it up. i.e., Do not obtain from Spring context
		HelloWorldClient client = new HelloWorldClient();
		client.sayHello();
	}
}