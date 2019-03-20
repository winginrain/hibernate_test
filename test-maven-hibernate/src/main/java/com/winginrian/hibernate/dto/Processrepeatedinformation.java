package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

import java.util.Date;

/**
 * Processrepeatedinformation generated by hbm2java
 */
public class Processrepeatedinformation implements java.io.Serializable {

	private Integer recordId;
	private Integer processId;
	private Short repeatedType;
	private Integer repeatedId1;
	private Integer repeatedId2;
	private Short repeatedTime;
	private Date startTime;
	private Date endTime;
	private String parameter1;
	private String parameter2;
	private String parameter3;

	public Processrepeatedinformation() {
	}

	public Processrepeatedinformation(Integer processId, Short repeatedType, Integer repeatedId1, Integer repeatedId2,
			Short repeatedTime, Date startTime, Date endTime, String parameter1, String parameter2, String parameter3) {
		this.processId = processId;
		this.repeatedType = repeatedType;
		this.repeatedId1 = repeatedId1;
		this.repeatedId2 = repeatedId2;
		this.repeatedTime = repeatedTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.parameter1 = parameter1;
		this.parameter2 = parameter2;
		this.parameter3 = parameter3;
	}

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Short getRepeatedType() {
		return this.repeatedType;
	}

	public void setRepeatedType(Short repeatedType) {
		this.repeatedType = repeatedType;
	}

	public Integer getRepeatedId1() {
		return this.repeatedId1;
	}

	public void setRepeatedId1(Integer repeatedId1) {
		this.repeatedId1 = repeatedId1;
	}

	public Integer getRepeatedId2() {
		return this.repeatedId2;
	}

	public void setRepeatedId2(Integer repeatedId2) {
		this.repeatedId2 = repeatedId2;
	}

	public Short getRepeatedTime() {
		return this.repeatedTime;
	}

	public void setRepeatedTime(Short repeatedTime) {
		this.repeatedTime = repeatedTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getParameter1() {
		return this.parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	public String getParameter2() {
		return this.parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	public String getParameter3() {
		return this.parameter3;
	}

	public void setParameter3(String parameter3) {
		this.parameter3 = parameter3;
	}

}
