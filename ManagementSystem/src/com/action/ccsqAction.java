package com.action;

import com.dao.ccsqDao;
import com.entity.Attence;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ccsqAction
{
  private String methodday;
  private String day;
  private String type;
  private String distination;
  private String reason;
  private String username;
  private ccsqDao dao = new ccsqDao();
  
  public String ccsqInsert()
  {
    System.out.println(this.methodday + "::" + this.day + "::" + this.type + "::" + this.distination + "::" + this.reason);
    
    Attence attence = new Attence();
    attence.setStartTime(changeTime(this.day));
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date date = null;
    try
    {
      date = sdf.parse(this.day);
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
    String dd = datePlusDay(Integer.parseInt(this.methodday), this.day);
    
   attence.setEndTime(changeTime(dd));
    attence.setAttencetype("出差".concat("(".concat(this.type.concat(")"))));
    attence.setReason("前往".concat(this.distination.concat(this.reason)));
    attence.setStatus("同意");
    attence.setMethod(this.methodday.concat("天0小时"));
    attence.setName(username);
    
    this.dao.ccsqInsert(attence);
    
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
    System.out.println("现在的日期是" + currdate + "::" + num);
    Calendar ca = Calendar.getInstance();
    ca.add(Calendar.DAY_OF_MONTH, num);
    currdate = ca.getTime();
    String enddate = format.format(currdate);
    System.out.println("增加天数以后的日期" + enddate);
    
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
  
  public String getMethodday()
  {
    return this.methodday;
  }
  
  public void setMethodday(String methodday)
  {
    this.methodday = methodday;
  }
  
  public String getDay()
  {
    return this.day;
  }
  
  public void setDay(String day)
  {
    this.day = day;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setType(String type)
  {
    this.type = type;
  }
  
  public String getDistination()
  {
    return this.distination;
  }
  
  public void setDistination(String distination)
  {
    this.distination = distination;
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
