package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processwebserviceinputmapping generated by hbm2java
 */
public class Processwebserviceinputmapping implements java.io.Serializable {

	private Integer id;
	private Integer activityId;
	private Integer applicationId;
	private Integer objectId;
	private Integer paramId;
	private Integer processId;

	public Processwebserviceinputmapping() {
	}

	public Processwebserviceinputmapping(Integer activityId, Integer applicationId, Integer objectId, Integer paramId,
			Integer processId) {
		this.activityId = activityId;
		this.applicationId = applicationId;
		this.objectId = objectId;
		this.paramId = paramId;
		this.processId = processId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public Integer getParamId() {
		return this.paramId;
	}

	public void setParamId(Integer paramId) {
		this.paramId = paramId;
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

}
