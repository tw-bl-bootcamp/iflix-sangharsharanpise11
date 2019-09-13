package com.thoughtworks.bootcamp.User.Service;

import java.io.UnsupportedEncodingException;

import com.thoughtworks.bootcamp.Responses.ResponseToken;
import com.thoughtworks.bootcamp.User.Dto.UserDto;

public interface UserService 
{
	ResponseToken login(UserDto userDto) throws UnsupportedEncodingException;
}