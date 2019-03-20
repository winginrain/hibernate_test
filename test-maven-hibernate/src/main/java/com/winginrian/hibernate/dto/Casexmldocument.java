package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Casexmldocument generated by hbm2java
 */
public class Casexmldocument implements java.io.Serializable {

	private Integer id;
	private Integer caseId;
	private Integer objectId;
	private String objectName;
	private String description;
	private Short source;
	private Short schemaId;
	private String xmldocument;

	public Casexmldocument() {
	}

	public Casexmldocument(Integer caseId, Integer objectId, String objectName, String description, Short source,
			Short schemaId, String xmldocument) {
		this.caseId = caseId;
		this.objectId = objectId;
		this.objectName = objectName;
		this.description = description;
		this.source = source;
		this.schemaId = schemaId;
		this.xmldocument = xmldocument;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getObjectId() {
		return this.objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	public String getObjectName() {
		return this.objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getSource() {
		return this.source;
	}

	public void setSource(Short source) {
		this.source = source;
	}

	public Short getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(Short schemaId) {
		this.schemaId = schemaId;
	}

	public String getXmldocument() {
		return this.xmldocument;
	}

	public void setXmldocument(String xmldocument) {
		this.xmldocument = xmldocument;
	}

}
