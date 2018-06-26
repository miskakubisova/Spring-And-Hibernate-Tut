package springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Go and shoot som goals!";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
