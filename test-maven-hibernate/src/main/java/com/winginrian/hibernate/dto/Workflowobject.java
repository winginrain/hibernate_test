package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Workflowobject generated by hbm2java
 */
public class Workflowobject implements java.io.Serializable {

	private Integer id;
	private String workflowId;
	private Integer objectId;
	private Short scope;
	private Short packageObjectId;
	private String objectName;
	private Boolean isvisible;
	private Boolean isinput;
	private Boolean isoutput;
	private Short objectType;

	public Workflowobject() {
	}

	public Workflowobject(String workflowId, Integer objectId, Short scope, Short packageObjectId, String objectName,
			Boolean isvisible, Boolean isinput, Boolean isoutput, Short objectType) {
		this.workflowId = workflowId;
		this.objectId = objectId;
		this.scope = scope;
		this.packageObjectId = packageObjectId;
		this.objectName = objectName;
		this.isvisible = isvisible;
		this.isinput = isinput;
		this.isoutput = isoutput;
		this.objectType = objectType;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWorkflowId() {
		return this.workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public Short getScope() {
		return this.scope;
	}

	public void setScope(Short scope) {
		this.scope = scope;
	}

	public Short getPackageObjectId() {
		return this.packageObjectId;
	}

	public void setPackageObjectId(Short packageObjectId) {
		this.packageObjectId = packageObjectId;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public Boolean getIsvisible() {
		return this.isvisible;
	}

	public void setIsvisible(Boolean isvisible) {
		this.isvisible = isvisible;
	}

	public Boolean getIsinput() {
		return this.isinput;
	}

	public void setIsinput(Boolean isinput) {
		this.isinput = isinput;
	}

	public Boolean getIsoutput() {
		return this.isoutput;
	}

	public void setIsoutput(Boolean isoutput) {
		this.isoutput = isoutput;
	}

	public Short getObjectType() {
		return this.objectType;
	}

	public void setObjectType(Short objectType) {
		this.objectType = objectType;
	}

}
