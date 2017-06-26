package com.action;

import com.entity.Jbsq;
import com.hibernate.HibernateSessionFactory;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;

public class txAjaxAction
{
  private String txmethod;
  private InputStream ajaxInputStream;
  
  public String getTxmethod()
  {
    return this.txmethod;
  }
  
  public void setTxmethod(String txmethod)
  {
    this.txmethod = txmethod;
  }
  
  public InputStream getAjaxInputStream()
  {
    return this.ajaxInputStream;
  }
  
  public void setAjaxInputStream(InputStream ajaxInputStream)
  {
    this.ajaxInputStream = ajaxInputStream;
  }
  
  public String calc()
  {
    System.out.println("ajax 后台" + this.txmethod);
    
    int result = 0;
    
    result = to_calc(Integer.parseInt(this.txmethod));
    
    this.ajaxInputStream = new StringBufferInputStream(String.valueOf(result));
    
    return "success";
  }
  
  public int to_calc(int txmethod)
  {
    Session session = HibernateSessionFactory.getSession();
    
    String hql = "from Jbsq";
    Query query = session.createQuery(hql);
    
    ArrayList<Jbsq> list = (ArrayList)query.list();
    
    int sumovertime = 0;
    for (Jbsq jbsq : list) {
      sumovertime += Integer.parseInt(jbsq.getMethod());
    }
    System.out.println(sumovertime);
    
    session.close();
    
    return sumovertime - txmethod;
  }
}
