package com.dao;

import com.entity.Attence;
import com.hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class jqsqDao
{
  public boolean jqsqInsert(Attence attence)
  {
    boolean result = false;
    
    Session session = HibernateSessionFactory.getSession();
    
    Transaction t = session.beginTransaction();
    
    Object id = session.save(attence);
    
    t.commit();
    
    session.close();
    if (id != null) {
      result = true;
    }
    return result;
  }
}
