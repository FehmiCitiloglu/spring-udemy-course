package com.fehmi.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	// add new fields for emailAddress and team
	private String emailAddres;
	private String team;

	public String getEmailAddres() {
		return emailAddres;
	}

	public void setEmailAddres(String emailAddres) {
		System.out.println("CricketCoach: inside setter method - setEmailAddres");
		this.emailAddres = emailAddres;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
