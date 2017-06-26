package com.dao;

import com.entity.Attence;
import com.hibernate.HibernateSessionFactory;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

public class QueryDao
{
  private ArrayList<Attence> attenceList;
  
  public ArrayList<Attence> Query()
  {
    Session session = HibernateSessionFactory.getSession();
    
    String hql = "from Attence";
    
    Query query = session.createQuery(hql);
    
    this.attenceList = ((ArrayList)query.list());
    
    session.close();
    
    return this.attenceList;
  }
  
  public static void main(String[] args)
  {
    QueryDao dao = new QueryDao();
    
    dao.Query();
  }
  
  public ArrayList<Attence> getAttenceList()
  {
    return this.attenceList;
  }
  
  public void setAttenceList(ArrayList<Attence> attenceList)
  {
    this.attenceList = attenceList;
  }
}
