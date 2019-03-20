package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Packagestartupinformation generated by hbm2java
 */
public class Packagestartupinformation implements java.io.Serializable {

	private Integer id;
	private Integer defaultWorkflowId;
	private Boolean needDate;
	private Boolean needDescription;
	private Boolean needName;
	private Boolean needPerson;
	private Boolean needResource;
	private Boolean needRole;
	private Boolean needStartPage;
	private Integer packageId;

	public Packagestartupinformation() {
	}

	public Packagestartupinformation(Integer defaultWorkflowId, Boolean needDate, Boolean needDescription,
			Boolean needName, Boolean needPerson, Boolean needResource, Boolean needRole, Boolean needStartPage,
			Integer packageId) {
		this.defaultWorkflowId = defaultWorkflowId;
		this.needDate = needDate;
		this.needDescription = needDescription;
		this.needName = needName;
		this.needPerson = needPerson;
		this.needResource = needResource;
		this.needRole = needRole;
		this.needStartPage = needStartPage;
		this.packageId = packageId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDefaultWorkflowId() {
		return this.defaultWorkflowId;
	}

	public void setDefaultWorkflowId(Integer defaultWorkflowId) {
		this.defaultWorkflowId = defaultWorkflowId;
	}

	public Boolean getNeedDate() {
		return this.needDate;
	}

	public void setNeedDate(Boolean needDate) {
		this.needDate = needDate;
	}

	public Boolean getNeedDescription() {
		return this.needDescription;
	}

	public void setNeedDescription(Boolean needDescription) {
		this.needDescription = needDescription;
	}

	public Boolean getNeedName() {
		return this.needName;
	}

	public void setNeedName(Boolean needName) {
		this.needName = needName;
	}

	public Boolean getNeedPerson() {
		return this.needPerson;
	}

	public void setNeedPerson(Boolean needPerson) {
		this.needPerson = needPerson;
	}

	public Boolean getNeedResource() {
		return this.needResource;
	}

	public void setNeedResource(Boolean needResource) {
		this.needResource = needResource;
	}

	public Boolean getNeedRole() {
		return this.needRole;
	}

	public void setNeedRole(Boolean needRole) {
		this.needRole = needRole;
	}

	public Boolean getNeedStartPage() {
		return this.needStartPage;
	}

	public void setNeedStartPage(Boolean needStartPage) {
		this.needStartPage = needStartPage;
	}

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

}