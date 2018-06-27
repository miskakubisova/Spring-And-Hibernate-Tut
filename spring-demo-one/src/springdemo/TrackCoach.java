package springdemo;

import services.FortuneService;

public class TrackCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStatupStuff() {
		System.out.println("TrachCoach: inside method doMyStatupStuff.");
	}
	
	//add an destroy method
	public void doMyDestroyStuff() {
		System.out.println("TrachCoach: inside method doMyDestroyStuff.");
	}
}
