package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (tennisCoach == theCoach);
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nPointing to the memory location tennisCoach: " + tennisCoach);
		System.out.println("\nPointing to the memory location theCoach: " + theCoach);
		
		//System.out.println(tennisCoach.getDailyWorkout());
		//System.out.println(tennisCoach.getDailyFortune());
		
		context.close();
	}

}
