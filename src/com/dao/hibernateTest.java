package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;




public class hibernateTest { 
	
	
	@Test
	public   void add() {
           //加载hibernate核心配置文件
		Configuration cfg=new Configuration();
		cfg.configure();
		
	
		// 创建sessionfactory对象
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		//使用sessionfactory创建session对象
		Session session=sessionFactory.openSession();
		//开启事务
		Transaction tx=session.beginTransaction();
		//写具体逻辑crud事件
		System.out.println(1);

		user2 user=new user2();
		user.setEmail("1277609958@qq.com");
		user.setId(11);
		System.out.println(1);

		user.setPassword("12345567");
		user.setSex("man");
		user.setTelephone("18861457582");
		user.setUsername("xianuzh");
//		TTable table=new TTable();
//		table.setId(1);
//		table.setPassword("1234566");
//		table.setUsername("timmy");
	   //提交事务
		session.save(user);
		tx.commit();
		
		//关闭资源
		session.close();
		sessionFactory.close();
		System.out.println(1);
	}

}
