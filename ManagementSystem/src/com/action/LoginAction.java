package com.action;

import com.entity.Usera;
import com.hibernate.HibernateSessionFactory;
import java.io.PrintStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

public class LoginAction
{
  private Usera user;
  private String errormsg;
  
  public String verify()
  {
    System.out.println(this.user.getUsername() + ":::" + this.user.getPassword());
    
    String username = this.user.getUsername() == null ? "" : this.user.getUsername();
    
    String password = this.user.getPassword() == null ? "" : this.user.getPassword();
    
    Session session = HibernateSessionFactory.getSession();
    
    
    /*
     * 	  System.out.println("通过账号查询出的密码：" + db_password);
     * */
    String hql = "select password from Usera where username=?";
    
    
    Query query = session.createQuery(hql);
    
    query.setParameter(0, username);
    
    String db_password = (String)query.uniqueResult();
    
    System.out.println("通过账号查询出的密码：" + db_password);
    
    /*
     * 	 System.out.println("通过账号查询出的flag：" + flag);
     * */
    String hql1 = "select flag from Usera where username=?";
    
    Query query1 = session.createQuery(hql1);
    
    query1.setParameter(0, username);
    
    String flag = query1.uniqueResult().toString();
    
    System.out.println("通过账号查询出的flag：" + flag);

    if (db_password == null)
    {
      this.errormsg = "账号或密码错误abc";
      
      return "error";
    }
    session.close();
    if (db_password.equals(this.user.getPassword())) {
    	
    	HttpServletRequest request=ServletActionContext.getRequest();
		
		HttpSession session1=request.getSession();
		
		session1.setAttribute("username", username);
		
		if(flag.equals("1")){
			
			session1.setAttribute("flag", "管理员");
			
		}else{
			
			session1.setAttribute("flag", "员工");
		}
    	
      return "success";
    }
    this.errormsg = "账号或密码错误abc";
    
    return "error";
  }
  
  public Usera getUser()
  {
    return this.user;
  }
  
  public void setUser(Usera user)
  {
    this.user = user;
  }
  
  public String getErrormsg()
  {
    return this.errormsg;
  }
  
  public void setErrormsg(String errormsg)
  {
    this.errormsg = errormsg;
  }
}
