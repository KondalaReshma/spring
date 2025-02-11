package com.spring.orm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateOperations;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
 
 
import com.spring.orm.entities.Student;
public class StudentDao {
	
	private SessionFactory sessionFactory;


	public StudentDao() {
	}
	@Transactional
	public Student save(Student  student)
	{
		try (Session session = sessionFactory.openSession()) {
			Student saveStudent = (Student) session.save( student);
			session.close();
			return saveStudent;
		}catch(Exception exception) {
		}
	return null;
	}
 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


}


