package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.timmy.uitls.Utils;




public class hibernateTest { 
	
	
	private Session session=null;
	private Transaction tx=null;
	@Test
	public   void add() {

	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件

		user2 user=new user2();
		user.setEmail("1277609958@qq.com");
	

		user.setPassword("1345567");
		user.setSex("man");
		user.setTelephone("18861457582");
		user.setUsername("xianuzh");
	   //提交事务
		session.saveOrUpdate(user);
		tx.commit();
		
	}catch(Exception e){
		tx.rollback();
	}finally{
		session.close();
		//	sessionFactory.close();

	}
	
		
		
		//关闭资源
		System.out.println(1);
	}

}
