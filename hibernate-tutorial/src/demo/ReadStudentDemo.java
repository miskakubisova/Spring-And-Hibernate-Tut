package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			Student tempStudent = new Student("Daffu", "Duck", "daffu@code.com");
			session.beginTransaction();
			System.out.println("Saving the student...");
			System.out.println(tempStudent);
			session.save(tempStudent);
			session.getTransaction().commit();
			
			System.out.println("Saved student. Generated id: " + tempStudent.getId());
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student myStudent = session.get(Student.class, tempStudent.getId());
			System.out.println("Get compelte: " + myStudent);
			session.getTransaction().commit();
			
			System.out.println("Done!");

		}
		finally {
			factory.close();
		}
	}


}
