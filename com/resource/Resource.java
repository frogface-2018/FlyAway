package com.resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Resource {
	
	private static SessionFactory sf;
	
	static {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		sf =con.buildSessionFactory();
		
	}
	public static SessionFactory getConnection() {
		return sf;
	}
	
	
	

}
