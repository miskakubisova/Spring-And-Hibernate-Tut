package app;

import springdemo.Coach;
import springdemo.TrackCoach;

public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach ();
		System.out.println(theCoach.getDailyWorkout());
	}

}
