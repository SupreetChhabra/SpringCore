package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		A temp=(A)context.getBean("aref");
		A a2=(A)context.getBean("aref2");
		A a3=(A)context.getBean("aref3");
		
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		
		System.out.println(temp);
		System.out.println(a2);
		System.out.println(a3);
	}

}
