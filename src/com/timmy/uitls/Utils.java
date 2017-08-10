package com.timmy.uitls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.loader.custom.Return;

public class Utils {
	
	
	private static SessionFactory sessionFactory;
	static
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		
	
		// 创建sessionfactory对象
		 sessionFactory=cfg.buildSessionFactory();
		
		
		
	}
	
	public  static SessionFactory getSessionFactory()
	{
		
		return sessionFactory;
	}
	

}
