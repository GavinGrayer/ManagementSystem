package com.action;

import com.dao.kqjlDao;
import com.entity.Attence;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class kqjlAction
{
  private String reason;
  private String time;
  private String emname;
  private String method;
  private String userintro;
  private String username;
  private String password;
  private String monitor;
  
  private kqjlDao dao = new kqjlDao();
  
  public String kqjlInsert()
  {
    System.out.println(this.reason + "::" + this.time + "::" + "::" + this.emname + "::" + this.method + "::" + this.userintro+"::"+this.monitor);
    
    Attence attence = new Attence();
    attence.setAttencetype(this.reason.concat("(".concat("考勤".concat(")"))));
    
    attence.setStartTime(changeTime(this.time));
    attence.setEndTime(changeTime(this.time));
    
    attence.setName(this.emname);
    attence.setReason(this.userintro);
    attence.setStatus("同意");
    attence.setMonitor(monitor);
    
    boolean result = this.dao.kqjlInsert(attence);
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
  
  public String getReason()
  {
    return this.reason;
  }
  
  public void setReason(String reason)
  {
    this.reason = reason;
  }
  
  public String getTime()
  {
    return this.time;
  }
  
  public void setTime(String time)
  {
    this.time = time;
  }
  
  public String getEmname()
  {
    return this.emname;
  }
  
  public void setEmname(String emname)
  {
    this.emname = emname;
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public void setMethod(String method)
  {
    this.method = method;
  }
  
  public String getUserintro()
  {
    return this.userintro;
  }
  
  public void setUserintro(String userintro)
  {
    this.userintro = userintro;
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }

public String getMonitor() {
	return monitor;
}

public void setMonitor(String monitor) {
	this.monitor = monitor;
}


  
}
