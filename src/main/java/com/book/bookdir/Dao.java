package com.book.bookdir;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




@Repository
public class Dao {

	@Autowired
 SessionFactory sessionFactory;
	
	public  ArrayList<bookdir>  fetchBooks() { 

		
		
		SessionFactory fact=sessionFactory;
		Session session =fact.openSession();
		Criteria c=session.createCriteria(bookdir.class);
		ArrayList<bookdir> list=(ArrayList<bookdir>) c.list();
	
		
//		bookdir br=session.load(bookdir.class,(long)10122);
//		System.out.println(br);
		
		return list ;
	}
	
	public String AddBook(bookdir book) {
		
		SessionFactory fact=sessionFactory;
		Session session =fact.openSession();
		session.save(book);
		return "book is Added";
		
		
	}
	public String update(bookdir book) {
		
		SessionFactory fact=sessionFactory;
		Session session =fact.openSession();
		session.saveOrUpdate(book);		
		return "book updated Successfully";
		
		
	}
	public String delete(int id) {
		
		
		SessionFactory fact=sessionFactory;
		Session session =fact.openSession();
		Transaction tr=session.beginTransaction();
		bookdir book=session.load(bookdir.class, id);
		session.delete(book);
		tr.commit();
		return "book deleted...";
		
		
	}
}
