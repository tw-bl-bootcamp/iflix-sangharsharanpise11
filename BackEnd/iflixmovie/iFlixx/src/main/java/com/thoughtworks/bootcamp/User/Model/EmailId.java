package com.thoughtworks.bootcamp.User.Model;

import java.io.Serializable;

public class EmailId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String To;
	private String From;
	private String Subject;
	private String Body;
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getBody() {
		return Body;
	}
	public void setBody(String body) {
		Body = body;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}