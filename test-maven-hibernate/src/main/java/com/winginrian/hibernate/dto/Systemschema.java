package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Systemschema generated by hbm2java
 */
public class Systemschema implements java.io.Serializable {

	private Integer schemaId;
	private String description;
	private String schemaName;
	private String schemaText;

	public Systemschema() {
	}

	public Systemschema(String description, String schemaName, String schemaText) {
		this.description = description;
		this.schemaName = schemaName;
		this.schemaText = schemaText;
	}

	public Integer getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(Integer schemaId) {
		this.schemaId = schemaId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}

	public String getSchemaText() {
		return this.schemaText;
	}

	public void setSchemaText(String schemaText) {
		this.schemaText = schemaText;
	}

}
