package com.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.dao.sjzdDao;
import com.entity.Sjzd;

public class sjzdAction {
	private String type;
	private ArrayList<Sjzd> sjzdList;
	private sjzdDao dao=new sjzdDao();
	ArrayList<String> peopArrayList=new ArrayList<String>();
	
	private String sjzdinserttype;
	private String sjzdinsertcontent;
	
	
	private String content;
	private String content1;
	
	private String sjzdid;
	
	/**
	 * 
	 * 	数据字典查询
	 * 
	 * */
	public String sjzdQuery(){
		
		sjzdList=dao.sjzds();
		
		return "success";
	}
	
	/**
	*
	*
	*	数据字典删除
	*/
	
	public String sjzdDelete(){
		
		System.out.println("content:::"+content+"content1::"+content1+"::sjzdid"+sjzdid);
		
		Sjzd sjzd=new Sjzd();
		sjzd.setSjzdid(new Long((long)Integer.parseInt(sjzdid)));
		dao.sjzdDelete(sjzd);
		
		
		return "success";
	}
	
	/**
	 * 
	 * 	数据字典修改
	 * 
	 * */
	public String sjzdUpdate(){
		
		System.out.println("content:::"+content+"content1::"+content1+"::sjzdid"+sjzdid);
		
		Sjzd sjzd=new Sjzd();
		sjzd.setSjzdid(Long.parseLong(sjzdid));
		sjzd.setType(content);
		sjzd.setContent(content1);
		
		dao.sjzdUpdate(sjzd);

		return "success";
	}
	
	/**
	 * 
	 * 
	 * 	数据字典insert
	 * 
	 * */
	
	public String sjzdInsert(){
		
		System.out.println("insert ..."+sjzdinserttype+"::"+sjzdinsertcontent);
		
		Sjzd sjzd=new Sjzd();
		sjzd.setType(sjzdinserttype);
		sjzd.setContent(sjzdinsertcontent);
		
		dao.sjzdInsert(sjzd);
		
		
		return "success";
	}
	
	
	
	
	public String sjzdPath(){
		
	    /**
	     * 	
	     * 	数据字典
	     * 
	     * */
		 try
	    {
	      this.type = new String(this.type.getBytes("ISO-8859-1"), "utf-8");
	    }
	    catch (UnsupportedEncodingException e)
	    {
	      e.printStackTrace();
	    }
		
	    
	    System.out.println("type in action::"+type);
	    
	    sjzdList=dao.sjzdquery(type);
	    
		for (Sjzd sjzd : sjzdList) {
			System.out.println(sjzd.getContent()+":----:"+sjzd.getType());
		}
		
		
		peopArrayList=dao.peopleQuery();

		return "success";
		
	}
	
	
	public static void main(String[] args) {
		sjzdAction action=new sjzdAction();
		action.sjzdPath();
	}
	
	
	
	

	public ArrayList<Sjzd> getSjzdList() {
		return sjzdList;
	}

	public void setSjzdList(ArrayList<Sjzd> sjzdList) {
		this.sjzdList = sjzdList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSjzdinserttype() {
		return sjzdinserttype;
	}

	public void setSjzdinserttype(String sjzdinserttype) {
		this.sjzdinserttype = sjzdinserttype;
	}

	public String getSjzdinsertcontent() {
		return sjzdinsertcontent;
	}

	public void setSjzdinsertcontent(String sjzdinsertcontent) {
		this.sjzdinsertcontent = sjzdinsertcontent;
	}

	public ArrayList<String> getPeopArrayList() {
		return peopArrayList;
	}

	public void setPeopArrayList(ArrayList<String> peopArrayList) {
		this.peopArrayList = peopArrayList;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

	public String getContent1() {
		return content1;
	}

	public void setContent1(String content1) {
		this.content1 = content1;
	}

	public String getSjzdid() {
		return sjzdid;
	}

	public void setSjzdid(String sjzdid) {
		this.sjzdid = sjzdid;
	}
	
	
	
}
