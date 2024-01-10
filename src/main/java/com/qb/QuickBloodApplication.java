package com.qb;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuickBloodApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickBloodApplication.class, args);
		System.out.println("QuickBlood Executed !!!");
	}
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
}
