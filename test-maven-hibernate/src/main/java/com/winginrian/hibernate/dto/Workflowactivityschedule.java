package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowactivityschedule generated by hbm2java
 */
public class Workflowactivityschedule implements java.io.Serializable {

	private Integer id;
	private Integer workflowId;
	private Integer activityId;
	private Integer duration;
	private Character durationUnit;

	public Workflowactivityschedule() {
	}

	public Workflowactivityschedule(Integer workflowId, Integer activityId, Integer duration, Character durationUnit) {
		this.workflowId = workflowId;
		this.activityId = activityId;
		this.duration = duration;
		this.durationUnit = durationUnit;
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

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Character getDurationUnit() {
		return this.durationUnit;
	}

	public void setDurationUnit(Character durationUnit) {
		this.durationUnit = durationUnit;
	}

}
