package com.entity;

import java.io.Serializable;
import java.util.Date;

public class Jbsq
  implements Serializable
{
  private Long jbsqid;
  private Date jbsqtime;
  private Date jbtime;
  private String method;
  private String reason;
  private String jbsqname;
  
  public Jbsq() {}
  
  public Jbsq(Date jbsqtime, Date jbtime, String method, String reason, String jbsqname)
  {
    this.jbsqtime = jbsqtime;
    this.jbtime = jbtime;
    this.method = method;
    this.reason = reason;
    this.jbsqname = jbsqname;
  }
  
  public Long getJbsqid()
  {
    return this.jbsqid;
  }
  
  public void setJbsqid(Long jbsqid)
  {
    this.jbsqid = jbsqid;
  }
  
  public Date getJbsqtime()
  {
    return this.jbsqtime;
  }
  
  public void setJbsqtime(Date jbsqtime)
  {
    this.jbsqtime = jbsqtime;
  }
  
  public Date getJbtime()
  {
    return this.jbtime;
  }
  
  public void setJbtime(Date jbtime)
  {
    this.jbtime = jbtime;
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
  
  public String getJbsqname()
  {
    return this.jbsqname;
  }
  
  public void setJbsqname(String jbsqname)
  {
    this.jbsqname = jbsqname;
  }
}
