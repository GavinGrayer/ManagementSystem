package com.action;

import com.dao.QueryDao;
import com.entity.Attence;
import java.io.PrintStream;
import java.util.ArrayList;

public class QueryAction
{
  private QueryDao dao = new QueryDao();
  private ArrayList<Attence> attenceList;
  
  public String query()
  {
    this.attenceList = this.dao.Query();
    for (Attence attence : this.attenceList) {
      System.out.println(attence.getName() + ":::" + attence.getStartTime() + ":::" + attence.getEndTime());
    }
    return "success";
  }
  
  public static void main(String[] args)
  {
    QueryAction action = new QueryAction();
    action.query();
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
