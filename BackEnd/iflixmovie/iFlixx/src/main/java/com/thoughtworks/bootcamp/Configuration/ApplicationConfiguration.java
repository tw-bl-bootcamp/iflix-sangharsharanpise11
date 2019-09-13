package com.thoughtworks.bootcamp.Configuration;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.thoughtworks.bootcamp.Responses.Response;


@Configuration
public class ApplicationConfiguration {
	 @Bean
	 ModelMapper getModelmapper()
	 {
		 ModelMapper modelMapper=new ModelMapper();
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 return modelMapper;
	 }
	 
	 @Bean
	 public Response getResponse()
	 {
			 return new Response(0, null);
	 }
	 
	 @Bean
		public PasswordEncoder getpasswordEncoder() {
			return new BCryptPasswordEncoder();
		}
	}
