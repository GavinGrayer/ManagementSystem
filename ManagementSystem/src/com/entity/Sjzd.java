package com.entity;

/**
 * Sjzd entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Sjzd implements java.io.Serializable {

	// Fields

	private Long sjzdid;
	private String type;
	private String content;

	// Constructors

	/** default constructor */
	public Sjzd() {
	}

	/** minimal constructor */
	public Sjzd(Long sjzdid) {
		this.sjzdid = sjzdid;
	}

	/** full constructor */
	public Sjzd(Long sjzdid, String type, String content) {
		this.sjzdid = sjzdid;
		this.type = type;
		this.content = content;
	}

	// Property accessors

	public Long getSjzdid() {
		return this.sjzdid;
	}

	public void setSjzdid(Long sjzdid) {
		this.sjzdid = sjzdid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}