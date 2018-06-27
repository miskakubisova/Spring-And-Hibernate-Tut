package sping_scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//chech ig they are the same
		boolean result = (theCoach == alphaCoach);
		
		//call methods on the bean
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alptaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();
	}

}
