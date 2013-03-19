package com.home.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.home.bean.HelloWorld;
import com.home.bean.HelloWorldImpl;


@Configuration
public class AppConfig
{

	@Bean(name="hello")
	public HelloWorld helloWorld()
	{
		return new HelloWorldImpl();
	}
}
