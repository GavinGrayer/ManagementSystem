package com.entity;

/**
 * Usera entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Usera implements java.io.Serializable {

	// Fields

	private String username;
	private String password;
	private Long flag;

	// Constructors

	/** default constructor */
	public Usera() {
	}

	/** minimal constructor */
	public Usera(String username) {
		this.username = username;
	}

	/** full constructor */
	public Usera(String username, String password, Long flag) {
		this.username = username;
		this.password = password;
		this.flag = flag;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getFlag() {
		return this.flag;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

}