package springdemo;

import services.FortuneService;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Go and shoot som goals!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
