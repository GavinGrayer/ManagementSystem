package com.entity;

import java.io.Serializable;
import java.util.Date;

public class Attence
  implements Serializable
{
  private Long attenceid;
  private String name;
  private Date startTime;
  private Date endTime;
  private String method;
  private String attencetype;
  private String reason;
  private String status;
  private String monitor;
  
  public Attence() {}
  
  public Attence(Long attenceid)
  {
    this.attenceid = attenceid;
  }
  
  public Attence(Long attenceid, String name, Date startTime, Date endTime, String method, String attencetype, String reason, String status, String monitor)
  {
    this.attenceid = attenceid;
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime;
    this.method = method;
    this.attencetype = attencetype;
    this.reason = reason;
    this.status = status;
    this.monitor = monitor;
  }
  
  public Long getAttenceid()
  {
    return this.attenceid;
  }
  
  public void setAttenceid(Long attenceid)
  {
    this.attenceid = attenceid;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public Date getStartTime()
  {
    return this.startTime;
  }
  
  public void setStartTime(Date startTime)
  {
    this.startTime = startTime;
  }
  
  public Date getEndTime()
  {
    return this.endTime;
  }
  
  public void setEndTime(Date endTime)
  {
    this.endTime = endTime;
  }
  
  public String getMethod()
  {
    return this.method;
  }
  
  public void setMethod(String method)
  {
    this.method = method;
  }
  
  public String getAttencetype()
  {
    return this.attencetype;
  }
  
  public void setAttencetype(String attencetype)
  {
    this.attencetype = attencetype;
  }
  
  public String getReason()
  {
    return this.reason;
  }
  
  public void setReason(String reason)
  {
    this.reason = reason;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public String getMonitor()
  {
    return this.monitor;
  }
  
  public void setMonitor(String monitor)
  {
    this.monitor = monitor;
  }
}
