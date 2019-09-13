package com.thoughtworks.bootcamp.User.Conroller;

import java.io.UnsupportedEncodingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtworks.bootcamp.Responses.ResponseToken;
import com.thoughtworks.bootcamp.User.Dto.UserDto;
import com.thoughtworks.bootcamp.User.Service.UserService;

@RestController
@CrossOrigin(allowedHeaders = "*" ,origins = "*")
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;
		
	@PostMapping("/login")
	public ResponseEntity<ResponseToken>login(@RequestBody UserDto userDto) throws UnsupportedEncodingException 
	{
		ResponseToken response=userService.login(userDto);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
