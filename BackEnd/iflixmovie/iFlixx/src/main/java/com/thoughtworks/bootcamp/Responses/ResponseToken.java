package com.thoughtworks.bootcamp.Responses;

public class ResponseToken {

	private int statusCode;
	private String statusMessage;
	private String token;
	
	public ResponseToken(int statusCode,String statusMessage,String token ) {
		this.statusCode=statusCode;
		this.statusMessage=statusMessage;
		this.token=token;
	}

	public ResponseToken() {
		
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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
