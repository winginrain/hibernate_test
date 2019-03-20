package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Personrole generated by hbm2java
 */
public class Personrole implements java.io.Serializable {

	private Integer id;
	private Integer personId;
	private Integer roleId;
	private Short ability;

	public Personrole() {
	}

	public Personrole(Integer personId, Integer roleId, Short ability) {
		this.personId = personId;
		this.roleId = roleId;
		this.ability = ability;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPersonId() {
		return this.personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Short getAbility() {
		return this.ability;
	}

	public void setAbility(Short ability) {
		this.ability = ability;
	}

}
