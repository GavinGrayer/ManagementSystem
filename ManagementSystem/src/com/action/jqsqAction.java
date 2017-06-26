package com.action;

import com.dao.jqsqDao;
import com.entity.Attence;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jqsqAction
{
  private String startTime;
  private String endTime;
  private String type;
  private String day;
  private String hour;
  private String reason;
  private String username;
  private jqsqDao dao = new jqsqDao();
  
  public String jqsqInsert()
  {
    System.out.println(this.startTime + "::" + this.endTime + "::" + this.type + "::" + this.day + "::" + this.hour + "::" + this.reason);
    
    Attence attence = new Attence();
    attence.setStartTime(changeTime(this.startTime));
    attence.setEndTime(changeTime(this.endTime));
    attence.setAttencetype(this.type);
    attence.setStatus("同意");
    attence.setMethod(this.day.concat("天".concat(this.hour.concat("小时"))));
    attence.setReason(this.reason);
    attence.setName(username);
    
    boolean result = this.dao.jqsqInsert(attence);
    if (result) {
      return "success";
    }
    return "error";
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
  
  public String getStartTime()
  {
    return this.startTime;
  }
  
  public void setStartTime(String startTime)
  {
    this.startTime = startTime;
  }
  
  public String getEndTime()
  {
    return this.endTime;
  }
  
  public void setEndTime(String endTime)
  {
    this.endTime = endTime;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public void setType(String type)
  {
    this.type = type;
  }
  
  public String getDay()
  {
    return this.day;
  }
  
  public void setDay(String day)
  {
    this.day = day;
  }
  
  public String getHour()
  {
    return this.hour;
  }
  
  public void setHour(String hour)
  {
    this.hour = hour;
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
