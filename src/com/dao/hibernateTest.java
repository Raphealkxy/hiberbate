package com.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.hibernate.Query;

import com.timmy.uitls.Utils;

import org.hibernate.Criteria;



public class hibernateTest { 
	
	private Session session=null;
	private Transaction tx=null;
	
	
	//查询所有对象记录
	@Test
	public   void SqlQuery() {
		
	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件
		 
	//语句是普通的sql语句
		 SQLQuery sqlQuery=session.createSQLQuery("select * from tb_user");
		 //返回的是一些数组集合，可以利用一些性质设置返回对象集合
		 sqlQuery.addEntity(User2.class);
		 List<User2>users=sqlQuery.list();
		
	          
		//query查询返回的是list集合；

	 for(User2 user:users)
	 {
		 System.out.println(user);
	 }
	   //提交事务
		
		tx.commit();
		
	}catch(Exception e){
		tx.rollback();
	}finally{
		session.close();
		//	sessionFactory.close();

	}
	
		
	
	}
	
	//查询所有对象记录
	@Test
	public   void Criteria() {
		
	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件
		 
		Criteria criteria=session.createCriteria(User2.class);
		List<User2>users=criteria.list();
		
	          
		//query查询返回的是list集合；

	 for(User2 user:users)
	 {
		 System.out.println(user);
	 }
	   //提交事务
		
		tx.commit();
		
	}catch(Exception e){
		tx.rollback();
	}finally{
		session.close();
		//	sessionFactory.close();

	}
	
		
	
	}
	
	//查询所有对象记录
	@Test
	public   void Query() {
		
	try{
	     session=Utils.getSessionFactory().openSession();
		//开启事务
		 tx=session.beginTransaction();
		//写具体逻辑crud事件
		 /**
		  * 查询整个对象的所有字段  String hql="select username,userpass from User";
		  * 查询整个对象的所有字段  String hql="select id from User";
		  * 查询整个对象的所有字段  String hql="from User"; 
		  */
		//query查询返回的是list集合；
	Query query= session.createQuery("from User2");
	List<User2> users=query.list();
	 for(User2 user:users)
	 {
		 System.out.println(user);
	 }
	   //提交事务
		
		tx.commit();
		
	}catch(Exception e){
		tx.rollback();
	}finally{
		session.close();
		//	sessionFactory.close();

	}
	
		
	
	}
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

	}
	
		
	
	}

}
