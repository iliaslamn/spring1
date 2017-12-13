package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//create the object
		Coach ilias = context.getBean("myCoach", Coach.class); 
		
		//use the object
		System.out.println(ilias.getDailyWorkout());
		
		
		context.close();
	}

}
 