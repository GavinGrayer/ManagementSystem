package com.action;

import com.dao.AllQueryDao;
import com.dao.sjzdDao;
import com.entity.Attence;
import com.entity.Jbsq;
import com.entity.Sjzd;
import com.entity.Txsq;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class AllQueryAction
{
  private String type;
  private ArrayList<Attence> attenceList;
  private ArrayList<Jbsq> jbsqList;
  private ArrayList<Txsq> txsqList;
  private AllQueryDao dao = new AllQueryDao();
  private sjzdDao sjzDao=new sjzdDao();
 
  
  
  public String jqQuery()
  {

    try
    {
      this.type = new String(this.type.getBytes("ISO-8859-1"), "utf-8");
    }
    catch (UnsupportedEncodingException e)
    {
      e.printStackTrace();
    }
    System.out.println("type::" + this.type);
    
    this.attenceList = this.dao.jqQuery(this.type);
    

    
    
    if (this.type.equals("加班")) {
      this.jbsqList = this.dao.jbQuery();
    }
    if (this.type.equals("调休")) {
      this.txsqList = this.dao.txQuery();
    }
    return "success";
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setType(String type)
  {
    this.type = type;
  }
  
  public ArrayList<Attence> getAttenceList()
  {
    return this.attenceList;
  }
  
  public void setAttenceList(ArrayList<Attence> attenceList)
  {
    this.attenceList = attenceList;
  }
  
  public ArrayList<Jbsq> getJbsqList()
  {
    return this.jbsqList;
  }
  
  public void setJbsqList(ArrayList<Jbsq> jbsqList)
  {
    this.jbsqList = jbsqList;
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
