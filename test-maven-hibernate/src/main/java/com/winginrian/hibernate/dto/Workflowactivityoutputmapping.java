package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowactivityoutputmapping generated by hbm2java
 */
public class Workflowactivityoutputmapping implements java.io.Serializable {

	private Integer id;
	private Integer workflowId;
	private Integer activityId;
	private Integer objectId;
	private String xslt;

	public Workflowactivityoutputmapping() {
	}

	public Workflowactivityoutputmapping(Integer workflowId, Integer activityId, Integer objectId, String xslt) {
		this.workflowId = workflowId;
		this.activityId = activityId;
		this.objectId = objectId;
		this.xslt = xslt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(Integer workflowId) {
		this.workflowId = workflowId;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getXslt() {
		return this.xslt;
	}

	public void setXslt(String xslt) {
		this.xslt = xslt;
	}

}
