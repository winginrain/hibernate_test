package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Processpersons generated by hbm2java
 */
public class Processpersons implements java.io.Serializable {

	private Integer id;
	private Short functionType;
	private Integer personId;
	private Integer processId;
	private Integer roleId;

	public Processpersons() {
	}

	public Processpersons(Short functionType, Integer personId, Integer processId, Integer roleId) {
		this.functionType = functionType;
		this.personId = personId;
		this.processId = processId;
		this.roleId = roleId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getFunctionType() {
		return this.functionType;
	}

	public void setFunctionType(Short functionType) {
		this.functionType = functionType;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getProcessId() {
		return this.processId;
	}

	public void setProcessId(Integer processId) {
		this.processId = processId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}