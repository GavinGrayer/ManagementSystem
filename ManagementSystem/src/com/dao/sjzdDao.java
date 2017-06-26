package com.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Sjzd;
import com.hibernate.HibernateSessionFactory;

public class sjzdDao {

	public ArrayList<Sjzd> sjzds(){
		ArrayList<Sjzd> sjzdList=new ArrayList<Sjzd>();
		
		Session session=HibernateSessionFactory.getSession();
		
		String hql="from Sjzd";
		
		Query query=session.createQuery(hql);
		
		sjzdList=(ArrayList<Sjzd>)query.list();

		session.close();
		return sjzdList;
	}
	
	/**
	 * 
	 * 	数据字典修改
	 * 
	 * */
	public boolean sjzdUpdate(Sjzd sjzd){
		
		boolean result=false;
		
		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.update(sjzd);
		
		transaction.commit();
		
		session.close();
		
		return result;
	}
	
	/**
	*
	*	数据字典删除
	*	
	*/
	
	public boolean sjzdDelete(Sjzd sjzd){
		
		boolean result=false;
		
		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=session.beginTransaction();
		
		String hql="delete from Sjzd where sjzdid = ?";
		
		
		Query query=session.createQuery(hql);
		
		query.setParameter(0, sjzd.getSjzdid());
		
		query.executeUpdate();
		
		transaction.commit();
		
		session.close();
		
		return result;
		
	}
	
	
	/**
	 * 
	 * 
	 * 	数据字典insert
	 * 
	 * */
	
	public boolean sjzdInsert(Sjzd sjzd){
		
		boolean result=false;
		
		Session session=HibernateSessionFactory.getSession();
		
		Transaction transaction=session.beginTransaction();
		
		session.save(sjzd);

		transaction.commit();
		
		session.close();
		
		return result;
	}
	
	/**
	 * 
	 * 查询出行人员
	 * 
	 * */
	public ArrayList<String> peopleQuery(){
		
		ArrayList<String> peopArrayList=new ArrayList<String>();
		
		Session session=HibernateSessionFactory.getSession();
		
		String hql="select username from Usera where flag=0";
		
		Query query=session.createQuery(hql);
		
		peopArrayList=(ArrayList<String>)query.list();
		
		session.close();
		
		return peopArrayList;
		
	}
	
	
	
	/**
	 * 
	 * 	申请列表————数据字典
	 * 
	 * */
	public ArrayList<Sjzd> sjzdquery(String type){
		
		
		ArrayList<Sjzd> sjzdList=new ArrayList<Sjzd>();
		
		if(type.equals("考勤")){
			
			type="考勤";
		}else if(type.equals("假")){
			
			type="假期";
		}else if(type.equals("出差")){
			
			type="出行";
		}
		
		System.out.println("type::"+type);
		
		Session session=HibernateSessionFactory.getSession();
		
		String hql="from Sjzd where type = ?";
		
		Query query=session.createQuery(hql);
		
		query.setParameter(0, type);
		
		sjzdList=(ArrayList<Sjzd>)query.list();

		session.close();
		
		return sjzdList;
		
	}
	
	
	public static void main(String[] args) {
		sjzdDao dao=new sjzdDao();
		ArrayList<Sjzd> sjzdList=dao.sjzdquery("考勤");
		
		
		for (Sjzd sjzd : sjzdList) {
			System.out.println(sjzd.getContent()+"::"+sjzd.getType());
		}
		
		Sjzd sjzd=new Sjzd();
		sjzd.setSjzdid(new Long((long)1062));
		dao.sjzdDelete(sjzd);
	}
	
	
	
	
}
