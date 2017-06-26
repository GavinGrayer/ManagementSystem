package com.action;

import com.dao.jbsqDao;
import com.entity.Attence;
import com.entity.Jbsq;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class jbsqAction
{
  private String today;
  private String overtime;
  private String method;
  private String reason;
  private String username;
  private jbsqDao dao = new jbsqDao();
  
  public String jbsqInsert()
  {
    System.out.println(this.today + "::" + this.overtime + "::" + this.method + "::" + this.reason);
    
    Attence attence = new Attence();
    attence.setStartTime(changeTime(this.today));
    String dd = datePlusDay(Integer.parseInt(this.method), this.today);
    attence.setEndTime(changeTime(dd));
    
    attence.setMethod(this.method.concat("个加班日"));
    attence.setAttencetype("加班");
    attence.setStatus("同意");
    attence.setReason(this.reason);
    attence.setName(username);
    
    Jbsq jbsq = new Jbsq();
    jbsq.setJbsqtime(changeTime(this.today));
    jbsq.setJbtime(changeTime(this.overtime));
    jbsq.setMethod(this.method);
    jbsq.setReason(this.reason);
    jbsq.setJbsqname(username);
    
    this.dao.jbsqInsert(attence, jbsq);
    
    return "success";
  }
  
  public String datePlusDay(int num, String newDate)
  {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date currdate = null;
    try
    {
      currdate = format.parse(newDate);
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
    System.out.println("现在的日期是：" + currdate + "::" + num);
    Calendar ca = Calendar.getInstance();
    ca.add(Calendar.DAY_OF_MONTH, num);
    currdate = ca.getTime();
    String enddate = format.format(currdate);
    System.out.println("增加天数以后的日期：" + enddate);
    
    return enddate;
  }
  
  public Date changeTime(String time)
  {
    Date date = new Date();
    String h = String.valueOf(date.getHours());
    String m = String.valueOf(date.getMinutes());
    String s = String.valueOf(date.getSeconds());
    
    String ctime = time.concat(" ".concat(h.concat(":".concat(m.concat(":".concat(s))))));
    
    System.out.println("修改后的time--->>>>::" + ctime);
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
    Date date2 = null;
    try
    {
      date2 = sdf.parse(ctime);
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
    return date2;
  }
  
  public String getToday()
  {
    return this.today;
  }
  
  public void setToday(String today)
  {
    this.today = today;
  }
  
  public String getOvertime()
  {
    return this.overtime;
  }
  
  public void setOvertime(String overtime)
  {
    this.overtime = overtime;
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public void setMethod(String method)
  {
    this.method = method;
  }
  
  public String getReason()
  {
    return this.reason;
  }
  
  public void setReason(String reason)
  {
    this.reason = reason;
  }

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
  
  
}
