package com.shravani.student.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		Student student=new Student();
		student.setId(102);
		student.setName("sunama");
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		factory.close();
	}
}
