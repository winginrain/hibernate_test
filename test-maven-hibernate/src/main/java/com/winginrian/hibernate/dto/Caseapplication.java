package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Caseapplication generated by hbm2java
 */
public class Caseapplication implements java.io.Serializable {

	private Integer id;
	private Integer caseId;
	private Integer applicationId;

	public Caseapplication() {
	}

	public Caseapplication(Integer caseId, Integer applicationId) {
		this.caseId = caseId;
		this.applicationId = applicationId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

}
