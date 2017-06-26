package com.action;

import com.dao.txsqDao;
import com.entity.Txsq;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class txsqAction
{
  private String today;
  private String txtime;
  private String txmethod;
  private String wxmethod;
  private String reason;
  private String username;
  private txsqDao dao = new txsqDao();
  
  public String txsqInsert()
  {
    Txsq txsq = new Txsq();
    txsq.setTxsqtime(changeTime(this.today));
    txsq.setTxmethod(this.txmethod);
    txsq.setWxmethod(this.wxmethod);
    txsq.setReason(this.reason);
    txsq.setStatus("同意");
    txsq.setTxsqname(username);
    
    this.dao.txsqInsert(txsq);
    return "success";
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
  
  public String getTxtime()
  {
    return this.txtime;
  }
  
  public void setTxtime(String txtime)
  {
    this.txtime = txtime;
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

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
  
  
}
