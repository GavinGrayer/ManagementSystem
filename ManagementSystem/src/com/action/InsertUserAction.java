package com.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.dao.UserDao;
import com.dao.sjzdDao;
import com.entity.Usera;

public class InsertUserAction {
	
	private String flag;
	
	private String username;
	
	private String password;

	ArrayList<Usera> peopArrayList=new ArrayList<Usera>();
	
	private sjzdDao dao=new sjzdDao();
	
	private UserDao userdao=new UserDao();
	
	
	/**
	 * 
	 * 	删除员工
	 * 
	 * */
	public String deleteUsera(){
		
		System.out.println("delete...username::"+username);
		
		
		try {
			username=new String(username.getBytes("ISO8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Usera usera=new Usera();
		usera.setUsername(username.trim());
		
		userdao.deleteUsera(usera);
		return "success";
	}
	
	/**
	 * 	更新员工
	 * 
	 * */
	public String updateUsera(){
		
		System.out.println("updateUsera... username::"+username+"password::"+password);
		
		Usera usera=new Usera();
		usera.setUsername(username.trim());
		usera.setPassword(password.trim());
		usera.setFlag(Long.valueOf("0"));
		
		userdao.updateUsera(usera);
		
		
		return "success";
	}
	
	/**
	 * 	添加员工
	 * 
	 * */
	public String insertUser(){
		
		System.out.println(flag+"::"+username+"::"+password);
		
		Usera usera=new Usera();
		usera.setFlag(Long.valueOf(flag));
		usera.setUsername(username);
		usera.setPassword(password);
		
		userdao.insertUser(usera);

		
		return "success";
	}
	
	
	/**
	 * 
	 * 	查询员工
	 * 
	 * */
	
	public String UserQuery(){
		
		System.out.println("---------");
		peopArrayList=userdao.peopleQuery();
		
		return "success";
	}
	

	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<Usera> getPeopArrayList() {
		return peopArrayList;
	}

	public void setPeopArrayList(ArrayList<Usera> peopArrayList) {
		this.peopArrayList = peopArrayList;
	}

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
