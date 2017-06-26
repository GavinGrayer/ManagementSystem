package com.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Usera;
import com.hibernate.HibernateSessionFactory;

public class UserDao {
	
	/**
	 * 
	 * 	删除员工
	 * 
	 * */
	public boolean deleteUsera(Usera usera){
		
		boolean result=false;
		
		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		session.delete(usera);
		
		
		transaction.commit();
		session.close();
		return result;
		
		
	}
	/**
	 * 	更新员工
	 * 
	 * */
	public boolean updateUsera(Usera usera){
	
		System.out.println(usera.getPassword()+"....");
		boolean result=false;
		
		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		session.update(usera);
		
		
		transaction.commit();
		session.close();
		return result;
		
		
		
	}
	/**
	 * 
	 * 查询出行人员
	 * 
	 * */
	public ArrayList<Usera> peopleQuery(){
		
		ArrayList<Usera> peopArrayList=new ArrayList<Usera>();
		
		Session session=HibernateSessionFactory.getSession();
		
		String hql="from Usera where flag=0";
		
		Query query=session.createQuery(hql);
		
		peopArrayList=(ArrayList<Usera>)query.list();
		
		session.close();
		
		return peopArrayList;
		
	}
	
	
	
	/**
	 * 	添加员工
	 * 
	 * */
	
	
	public boolean insertUser(Usera usera){
		
		boolean result=false;
		
		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=session.beginTransaction();
		
		
		session.save(usera);
		
		
		transaction.commit();
		session.close();
		return result;
	}
	
	
	public static void main(String[] args) {
		UserDao dao=new UserDao();
		Usera usera=new Usera();
		usera.setFlag(Long.valueOf("0"));
		usera.setPassword("1234546");
		usera.setUsername("臧阳");
		dao.updateUsera(usera);
	}
	
	
}
