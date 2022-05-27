package com.fehmi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container

		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());

		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddres());
		System.out.println(theCoach.getTeam());

		// close the context
		context.close();
	}
}
