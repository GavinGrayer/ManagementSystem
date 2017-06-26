package com.dao;

import com.entity.Attence;
import com.entity.Jbsq;
import com.hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class jbsqDao
{
  public boolean jbsqInsert(Attence attence, Jbsq jbsq)
  {
    boolean result = false;
    
    Session session = HibernateSessionFactory.getSession();
    
    Transaction t = session.beginTransaction();
    
    Object id = session.save(attence);
    
    Object id1 = session.save(jbsq);
    
    t.commit();
    
    session.close();
    if (id != null) {
      result = true;
    }
    return result;
  }
}
