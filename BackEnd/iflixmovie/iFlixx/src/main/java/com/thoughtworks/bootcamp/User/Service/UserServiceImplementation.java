package com.thoughtworks.bootcamp.User.Service;

import java.io.UnsupportedEncodingException;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.thoughtworks.bootcamp.Responses.ResponseToken;
import com.thoughtworks.bootcamp.User.Dto.UserDto;
import com.thoughtworks.bootcamp.User.Model.User;
import com.thoughtworks.bootcamp.User.Repository.UserRepository;
import com.thoughtworks.bootcamp.Utility.ResponseStatus;
import com.thoughtworks.bootcamp.Utility.TokenGenerators;

@Service("userService")
@PropertySource("message.properties")
public class UserServiceImplementation implements UserService{
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TokenGenerators tokenGenerators;

	@Autowired
	private MailService mailService;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private Environment environment;


	@Override
	public ResponseToken login(UserDto userDto) throws UnsupportedEncodingException {
		ResponseToken response;
		System.out.println(userDto);
		
	    Optional<User> availability = userRepository.findByEmailId(userDto.getEmailId());
		if (availability.isPresent()) 
		{
			if(availability.get().getPassword().equals(userDto.getPassword()))
			{
				String tokengenerate=tokenGenerators.generateToken(availability.get().getUserId());
				
				response=ResponseStatus.tokenStatusInformation(environment.getProperty("status.login.success"),
						Integer.parseInt(environment.getProperty("status.success.code")), tokengenerate);
				return response;
			}	
		}
		return response=new ResponseToken(400,"User Not Logged in SuccessFully","");			
	}
}
