package com.tns.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		
		Airtel s=c.getBean("Sim", Airtel.class);
		
		s.calling();
		s.data();
		
	}

}
