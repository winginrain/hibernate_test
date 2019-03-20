package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowevent generated by hbm2java
 */
public class Workflowevent implements java.io.Serializable {

	private Integer id;
	private Integer workflowId;
	private Integer eventId;
	private String eventName;
	private String description;
	private String eventRepresentation;
	private Short eventType;
	private Short logicType;
	private Integer activityId;

	public Workflowevent() {
	}

	public Workflowevent(Integer workflowId, Integer eventId, String eventName, String description,
			String eventRepresentation, Short eventType, Short logicType, Integer activityId) {
		this.workflowId = workflowId;
		this.eventId = eventId;
		this.eventName = eventName;
		this.description = description;
		this.eventRepresentation = eventRepresentation;
		this.eventType = eventType;
		this.logicType = logicType;
		this.activityId = activityId;
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

	public Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEventRepresentation() {
		return this.eventRepresentation;
	}

	public void setEventRepresentation(String eventRepresentation) {
		this.eventRepresentation = eventRepresentation;
	}

	public Short getEventType() {
		return this.eventType;
	}

	public void setEventType(Short eventType) {
		this.eventType = eventType;
	}

	public Short getLogicType() {
		return this.logicType;
	}

	public void setLogicType(Short logicType) {
		this.logicType = logicType;
	}

	public Integer getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

}
