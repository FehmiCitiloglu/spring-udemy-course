package com.fehmi.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}
}
