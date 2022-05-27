package com.fehmi.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
// @Scope("singelton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define my init method

	@PostConstruct
	public void doMyStartuoStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff() ");
	}

	// define my destroy method

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}

	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService theFortuneService) {
	 * System.out.println(">> TeniisCoac: inside doSomeCrazyStuff() method");
	 * fortuneService = theFortuneService; }
	 */
	// define a setter method
	// @Autowired
	// public void setFortuneService(FortuneService theFortuneService) {
	// System.out.println(">> TennisCoach: inside setFortuneService() method");
	// fortuneService = theFortuneService;
	// }

	// @Autowired
	// public TennisCoach(FortuneService theFortuneService) {
	// fortuneService = theFortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
