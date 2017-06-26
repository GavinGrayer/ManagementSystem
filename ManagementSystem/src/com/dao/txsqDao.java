package com.dao;

import com.entity.Txsq;
import com.hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class txsqDao
{
  public boolean txsqInsert(Txsq txsq)
  {
    boolean result = false;
    
    Session session = HibernateSessionFactory.getSession();
    
    Transaction t = session.beginTransaction();
    
    Object id = session.save(txsq);
    
    t.commit();
    
    session.close();
    if (id != null) {
      result = true;
    }
    return result;
  }
}
