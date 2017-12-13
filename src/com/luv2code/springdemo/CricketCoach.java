package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	private String emailAddress;
	
	
	public String getTeam() {
		return team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	//Create no-arg contractor
	 public CricketCoach() {
		 System.out.println("CricketCoach: inside no-arg contructor");
	}
	 //our setter method
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
