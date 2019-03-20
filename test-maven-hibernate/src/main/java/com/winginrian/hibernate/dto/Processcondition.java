package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processcondition generated by hbm2java
 */
public class Processcondition implements java.io.Serializable {

	private Integer id;
	private Integer processId;
	private Integer conditionId;
	private String conditionRepresentation;
	private String comparator;
	private Short valueType;
	private String value;

	public Processcondition() {
	}

	public Processcondition(Integer processId, Integer conditionId, String conditionRepresentation, String comparator,
			Short valueType, String value) {
		this.processId = processId;
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

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
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