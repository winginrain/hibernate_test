package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processcustomapplication generated by hbm2java
 */
public class Processcustomapplication implements java.io.Serializable {

	private Integer id;
	private Integer applicationId;
	private Integer processId;

	public Processcustomapplication() {
	}

	public Processcustomapplication(Integer applicationId, Integer processId) {
		this.applicationId = applicationId;
		this.processId = processId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

}
