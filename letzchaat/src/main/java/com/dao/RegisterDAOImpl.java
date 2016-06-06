package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Register;

@Repository
public class RegisterDAOImpl implements RegisterDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	 public Session getSession()
	   {
	   	return sessionFactory.openSession();
	   }

	public void addUser(Register r) {
	
			Session session = getSession();
			Transaction t=session.beginTransaction();
			session.save(r);
		    t.commit();
	       System.out.println("User Registered successfully"+r);	
	}
	
	

}
