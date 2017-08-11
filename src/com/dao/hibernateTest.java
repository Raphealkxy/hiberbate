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
	public   void DeleteObject() {
		
	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件

		 User2 user =(User2) session.get(User2.class, 3);
	
	   //提交事务
		session.delete(user);
		tx.commit();
		
	}catch(Exception e){
		tx.rollback();
	}finally{
		session.close();
		//	sessionFactory.close();

	}
	
		
	
	}
	@Test
	public   void updateObject() {
		
	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件

	   User2 user=(User2) session.get(User2.class, 2);
	   user.setEmail("1371014802@qq.com");
	   //提交事务
		session.saveOrUpdate(user);
		tx.commit();
		
	}catch(Exception e){
		tx.rollback();
	}finally{
		session.close();
		//	sessionFactory.close();

	}
	
		
	
	}
	@Test
	public   void getObject() {
		
		try{
		     session=Utils.getSessionFactory().openSession();
			//开启事务
			 tx=session.beginTransaction();

			 User2 user2=(User2) session.get(User2.class,1);
			 
			System.out.println(user2);
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

	@Test
	public   void addObject() {
		
	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件

		User2 user=new User2();
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
	
		
	
	}

}
