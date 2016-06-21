package com.krishna.usingcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	private static ApplicationContext context ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle");
		triangle.draw();
	}

}
