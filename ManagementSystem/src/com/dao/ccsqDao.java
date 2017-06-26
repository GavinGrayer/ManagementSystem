package com.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.entity.Attence;
import com.hibernate.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ccsqDao
{
  public boolean ccsqInsert(Attence attence)
  {
    boolean result = false;
    
    Session session = HibernateSessionFactory.getSession();
    
    Transaction t = session.beginTransaction();
    
    Object id = session.save(attence);
    
    System.out.println("id::::--->>>>"+id);
    
    
    
    t.commit();
    
    session.close();
    if (id != null) {
      result = true;
    }
    return result;
  }
  
  
  
}
