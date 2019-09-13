package com.thoughtworks.bootcamp.Responses;

public class Response {

	private int statusCode;
	private String statusMessage;
	
	public Response(int statusCode,String statusMessage) {	
		this.statusCode=statusCode;
		this.statusMessage=statusMessage;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	 
	
}