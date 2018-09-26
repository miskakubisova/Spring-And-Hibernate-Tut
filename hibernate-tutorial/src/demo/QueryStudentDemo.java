package demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Student> theStudents = session.createQuery("from Student").list();
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where s.lastName='Wall'").list();
			System.out.println("\n\nStudents who have last  name of Wall");
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where s.lastName='Wall'" + " OR s.firstName='Daffu'").list();
			System.out.println("\n\nStudents who have last  name of Wall or first name of Duffu");
			displayStudents(theStudents);
			
			theStudents = session.createQuery("from Student s where s.email LIKE '%code.com'").list();
			System.out.println("\n\nStudents who have email like 'code.com'");
			displayStudents(theStudents);
			
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

}
