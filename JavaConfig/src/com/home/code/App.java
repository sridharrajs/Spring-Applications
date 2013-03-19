package com.home.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.home.bean.HelloWorld;
import com.home.cofig.AppConfig;

public class App
{	
	public static void main(String args[])
	{
	
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld helo=((HelloWorld) context.getBean("hello"));
		helo.printMgs("using configs");
	}
	
}
