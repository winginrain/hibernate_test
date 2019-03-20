package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

import java.util.Date;

/**
 * Packageinformation generated by hbm2java
 */
public class Packageinformation implements java.io.Serializable {

	private Integer packageId;
	private String packageName;
	private String description;
	private Character durationUnit;
	private Float costUnit;
	private Integer authorId;
	private Date createDate;

	public Packageinformation() {
	}

	public Packageinformation(String packageName, String description, Character durationUnit, Float costUnit,
			Integer authorId, Date createDate) {
		this.packageName = packageName;
		this.description = description;
		this.durationUnit = durationUnit;
		this.costUnit = costUnit;
		this.authorId = authorId;
		this.createDate = createDate;
	}

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Character getDurationUnit() {
		return this.durationUnit;
	}

	public void setDurationUnit(Character durationUnit) {
		this.durationUnit = durationUnit;
	}

	public Float getCostUnit() {
		return this.costUnit;
	}

	public void setCostUnit(Float costUnit) {
		this.costUnit = costUnit;
	}

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
