package com.entity;

import java.io.Serializable;
import java.util.Date;

public class Txsq
  implements Serializable
{
  private Long txsqid;
  private String txsqname;
  private Date txsqtime;
  private String txmethod;
  private String wxmethod;
  private String reason;
  private String status;
  private String monitor;
  private Date txtime;
  
  public Txsq() {}
  
  public Txsq(String txsqname, Date txsqtime, String txmethod, String wxmethod, String reason, String status, String monitor, Date txtime)
  {
    this.txsqname = txsqname;
    this.txsqtime = txsqtime;
    this.txmethod = txmethod;
    this.wxmethod = wxmethod;
    this.reason = reason;
    this.status = status;
    this.monitor = monitor;
    this.txtime = txtime;
  }
  
  public Long getTxsqid()
  {
    return this.txsqid;
  }
  
  public void setTxsqid(Long txsqid)
  {
    this.txsqid = txsqid;
  }
  
  public String getTxsqname()
  {
    return this.txsqname;
  }
  
  public void setTxsqname(String txsqname)
  {
    this.txsqname = txsqname;
  }
  
  public Date getTxsqtime()
  {
    return this.txsqtime;
  }
  
  public void setTxsqtime(Date txsqtime)
  {
    this.txsqtime = txsqtime;
  }
  
  public String getTxmethod()
  {
    return this.txmethod;
  }
  
  public void setTxmethod(String txmethod)
  {
    this.txmethod = txmethod;
  }
  
  public String getWxmethod()
  {
    return this.wxmethod;
  }
  
  public void setWxmethod(String wxmethod)
  {
    this.wxmethod = wxmethod;
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
  
  public Date getTxtime()
  {
    return this.txtime;
  }
  
  public void setTxtime(Date txtime)
  {
    this.txtime = txtime;
  }
}
