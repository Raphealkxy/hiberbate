package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.timmy.uitls.Utils;




public class hibernateTest { 
	
	
	@Test
	public   void add() {

	
	
		Session session=Utils.getSessionFactory().openSession();
		//开启事务
		Transaction tx=session.beginTransaction();
		//写具体逻辑crud事件

		user2 user=new user2();
		user.setEmail("1277609958@qq.com");
		//user.setId(12);
		//System.out.println(1);

		user.setPassword("112345567");
		user.setSex("man");
		user.setTelephone("18861457582");
		user.setUsername("xianuzh");
	   //提交事务
		session.save(user);
		tx.commit();
		
		//关闭资源
		session.close();
	//	sessionFactory.close();
		System.out.println(1);
	}

}
