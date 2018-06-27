package spring_life_cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
