package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processactivityinvokingworkflow generated by hbm2java
 */
public class Processactivityinvokingworkflow implements java.io.Serializable {

	private Integer id;
	private Integer processId;
	private Integer activityId;
	private Integer invokedWorkflowId;
	private Integer invokedProcessId;
	private Short invocationType;

	public Processactivityinvokingworkflow() {
	}

	public Processactivityinvokingworkflow(Integer processId, Integer activityId, Integer invokedWorkflowId,
			Integer invokedProcessId, Short invocationType) {
		this.processId = processId;
		this.activityId = activityId;
		this.invokedWorkflowId = invokedWorkflowId;
		this.invokedProcessId = invokedProcessId;
		this.invocationType = invocationType;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Integer getInvokedWorkflowId() {
		return this.invokedWorkflowId;
	}

	public void setInvokedWorkflowId(Integer invokedWorkflowId) {
		this.invokedWorkflowId = invokedWorkflowId;
	}

	public Integer getInvokedProcessId() {
		return this.invokedProcessId;
	}

	public void setInvokedProcessId(Integer invokedProcessId) {
		this.invokedProcessId = invokedProcessId;
	}

	public Short getInvocationType() {
		return this.invocationType;
	}

	public void setInvocationType(Short invocationType) {
		this.invocationType = invocationType;
	}

}