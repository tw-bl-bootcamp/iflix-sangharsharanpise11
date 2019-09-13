package com.thoughtworks.bootcamp.Utility;

import com.thoughtworks.bootcamp.Responses.Response;
import com.thoughtworks.bootcamp.Responses.ResponseToken;

public class ResponseStatus 
{
 public static Response statusInformation(String statusMessage,int statusCode)
 {
	 //Response response=new Response();before testing
	Response response=new Response(statusCode, statusMessage);
	response.setStatusCode(statusCode);
	response.setStatusMessage(statusMessage);
	return response;
 }
 
 public static ResponseToken tokenStatusInformation(String statusMessage,int statusCode,String token)
 {
	 ResponseToken responseToken=new ResponseToken();
	 responseToken.setStatusCode(statusCode);
	 responseToken.setStatusMessage(statusMessage);
	 responseToken.setToken(token);
	return responseToken;
 }
 
 public static ResponseToken statusResponseInformation(String statusMessage,int statusCode)
 {
	 ResponseToken response=new ResponseToken();
	 response.setStatusCode(statusCode);
	 response.setStatusMessage(statusMessage);
	return response;
	 
 }
}