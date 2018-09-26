package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			Student tempStudent1 = new Student("Paul", "Wall", "paul@code.com");
			Student tempStudent2 = new Student("Mary", "Public", "mary@code.com");
			Student tempStudent3 = new Student("Bonita", "Apple", "boita@code.com");
			session.beginTransaction();
			System.out.println("Saving the students...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}
