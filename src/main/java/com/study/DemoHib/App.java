package com.study.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien avi = new Alien();
    	avi.setAid(11);
    	avi.setAname("Raviraj");
    	avi.setColor("blue");
    	
    	Configuration con =  new Configuration().configure().addAnnotatedClass(Alien.class);
    	SessionFactory sf =  con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(avi);
    	tx.commit();
    }
}
