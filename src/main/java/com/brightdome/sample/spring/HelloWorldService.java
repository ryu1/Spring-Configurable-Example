package com.brightdome.sample.spring;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public void sayHello() {
		System.out.println("Hello World!");
		Sample sample = new Sample();
		sample.foo();
	}
}