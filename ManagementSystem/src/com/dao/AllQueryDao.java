package com.dao;

import com.entity.Attence;
import com.entity.Jbsq;
import com.entity.Txsq;
import com.hibernate.HibernateSessionFactory;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

public class AllQueryDao
{
  private ArrayList<Attence> attenceList;
  private ArrayList<Jbsq> jbsqList;
  private ArrayList<Txsq> txsqList;
  
  public ArrayList<Attence> jqQuery(String type)
  {
    Session session = HibernateSessionFactory.getSession();
    
    String hql = "from Attence where attencetype like ?";
    
    Query query = session.createQuery(hql);
    
    query.setParameter(0, "%" + type + "%");
    
    this.attenceList = ((ArrayList)query.list());
    
    session.close();
    
    return this.attenceList;
  }
  
  public ArrayList<Jbsq> jbQuery()
  {
    Session session = HibernateSessionFactory.getSession();
    
    String hql = "from Jbsq";
    
    Query query = session.createQuery(hql);
    
    this.jbsqList = ((ArrayList)query.list());
    
    session.close();
    
    return this.jbsqList;
  }
  
  public ArrayList<Txsq> txQuery()
  {
    Session session = HibernateSessionFactory.getSession();
    
    String hql = "from Txsq";
    
    Query query = session.createQuery(hql);
    
    this.txsqList = ((ArrayList)query.list());
    
    session.close();
    
    return this.txsqList;
  }
  
  public ArrayList<Jbsq> getJbsqList()
  {
    return this.jbsqList;
  }
  
  public void setJbsqList(ArrayList<Jbsq> jbsqList)
  {
    this.jbsqList = jbsqList;
  }
  
  public ArrayList<Attence> getAttenceList()
  {
    return this.attenceList;
  }
  
  public void setAttenceList(ArrayList<Attence> attenceList)
  {
    this.attenceList = attenceList;
  }
  
  public ArrayList<Txsq> getTxsqList()
  {
    return this.txsqList;
  }
  
  public void setTxsqList(ArrayList<Txsq> txsqList)
  {
    this.txsqList = txsqList;
  }
}
