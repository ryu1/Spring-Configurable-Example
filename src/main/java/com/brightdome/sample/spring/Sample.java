package com.brightdome.sample.spring;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Sample {
	
	public Sample() {
		System.out.println("sample");
	}
	
	public void foo() {
		System.out.println("foo");
	}

}
