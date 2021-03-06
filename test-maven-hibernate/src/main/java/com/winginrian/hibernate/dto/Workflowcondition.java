package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowcondition generated by hbm2java
 */
public class Workflowcondition implements java.io.Serializable {

	private Integer id;
	private Integer workflowId;
	private Integer conditionId;
	private String conditionRepresentation;
	private String comparator;
	private Short valueType;
	private String value;

	public Workflowcondition() {
	}

	public Workflowcondition(Integer workflowId, Integer conditionId, String conditionRepresentation, String comparator,
			Short valueType, String value) {
		this.workflowId = workflowId;
		this.conditionId = conditionId;
		this.conditionRepresentation = conditionRepresentation;
		this.comparator = comparator;
		this.valueType = valueType;
		this.value = value;
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

	public Integer getConditionId() {
		return this.conditionId;
	}

	public void setConditionId(Integer conditionId) {
		this.conditionId = conditionId;
	}

	public String getConditionRepresentation() {
		return this.conditionRepresentation;
	}

	public void setConditionRepresentation(String conditionRepresentation) {
		this.conditionRepresentation = conditionRepresentation;
	}

	public String getComparator() {
		return this.comparator;
	}

	public void setComparator(String comparator) {
		this.comparator = comparator;
	}

	public Short getValueType() {
		return this.valueType;
	}

	public void setValueType(Short valueType) {
		this.valueType = valueType;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
