package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowactivityresource generated by hbm2java
 */
public class Workflowactivityresource implements java.io.Serializable {

	private Integer id;
	private Integer workflowId;
	private Integer activityId;
	private Integer resourceId;
	private Short minimalNumber;
	private Short maximalNumber;

	public Workflowactivityresource() {
	}

	public Workflowactivityresource(Integer workflowId, Integer activityId, Integer resourceId, Short minimalNumber,
			Short maximalNumber) {
		this.workflowId = workflowId;
		this.activityId = activityId;
		this.resourceId = resourceId;
		this.minimalNumber = minimalNumber;
		this.maximalNumber = maximalNumber;
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

	public Integer getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Short getMinimalNumber() {
		return this.minimalNumber;
	}

	public void setMinimalNumber(Short minimalNumber) {
		this.minimalNumber = minimalNumber;
	}

	public Short getMaximalNumber() {
		return this.maximalNumber;
	}

	public void setMaximalNumber(Short maximalNumber) {
		this.maximalNumber = maximalNumber;
	}

}
