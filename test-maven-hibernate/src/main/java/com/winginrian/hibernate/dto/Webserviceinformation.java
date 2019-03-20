package com.winginrian.hibernate.dto;
// Generated 2019-3-20 0:37:34 by Hibernate Tools 5.2.11.Final

/**
 * Webserviceinformation generated by hbm2java
 */
public class Webserviceinformation implements java.io.Serializable {

	private Integer applicationId;
	private String inputSchema;
	private String methodName;
	private String outputSchema;
	private String passWord;
	private String url;
	private String userName;
	private String webServiceName;

	public Webserviceinformation() {
	}

	public Webserviceinformation(String inputSchema, String methodName, String outputSchema, String passWord,
			String url, String userName, String webServiceName) {
		this.inputSchema = inputSchema;
		this.methodName = methodName;
		this.outputSchema = outputSchema;
		this.passWord = passWord;
		this.url = url;
		this.userName = userName;
		this.webServiceName = webServiceName;
	}

	public Integer getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public String getInputSchema() {
		return this.inputSchema;
	}

	public void setInputSchema(String inputSchema) {
		this.inputSchema = inputSchema;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getOutputSchema() {
		return this.outputSchema;
	}

	public void setOutputSchema(String outputSchema) {
		this.outputSchema = outputSchema;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getWebServiceName() {
		return this.webServiceName;
	}

	public void setWebServiceName(String webServiceName) {
		this.webServiceName = webServiceName;
	}

}
