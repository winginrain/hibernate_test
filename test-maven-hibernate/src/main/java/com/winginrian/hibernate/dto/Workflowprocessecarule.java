package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowprocessecarule generated by hbm2java
 */
public class Workflowprocessecarule implements java.io.Serializable {

	private Integer id;
	private Integer workflowId;
	private Integer ruleId;
	private Integer eventId;
	private Integer conditionId;
	private String actionExpression;

	public Workflowprocessecarule() {
	}

	public Workflowprocessecarule(Integer workflowId, Integer ruleId, Integer eventId, Integer conditionId,
			String actionExpression) {
		this.workflowId = workflowId;
		this.ruleId = ruleId;
		this.eventId = eventId;
		this.conditionId = conditionId;
		this.actionExpression = actionExpression;
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

	public Integer getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	public Integer getEventId() {
		return this.eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getConditionId() {
		return this.conditionId;
	}

	public void setConditionId(Integer conditionId) {
		this.conditionId = conditionId;
	}

	public String getActionExpression() {
		return this.actionExpression;
	}

	public void setActionExpression(String actionExpression) {
		this.actionExpression = actionExpression;
	}

}
