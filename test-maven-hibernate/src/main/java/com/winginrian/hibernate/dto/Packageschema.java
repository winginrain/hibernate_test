package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Packageschema generated by hbm2java
 */
public class Packageschema implements java.io.Serializable {

	private Integer id;
	private Integer packageId;
	private Short schemaId;
	private String schemaName;
	private String description;
	private String schemaText;

	public Packageschema() {
	}

	public Packageschema(Integer packageId, Short schemaId, String schemaName, String description, String schemaText) {
		this.packageId = packageId;
		this.schemaId = schemaId;
		this.schemaName = schemaName;
		this.description = description;
		this.schemaText = schemaText;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	public Short getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(Short schemaId) {
		this.schemaId = schemaId;
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSchemaText() {
		return this.schemaText;
	}

	public void setSchemaText(String schemaText) {
		this.schemaText = schemaText;
	}

}