package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
 
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
		
	public TennisCoach() {}
	
	@PostConstruct
	public void doMySturtupStuff() {
		System.out.println("Inside my startup.");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside cleanup.");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
