package com.home.bean;

public class HelloWorldImpl implements HelloWorld
{
	@Override
	public void printMgs(String msg)
	{
		System.out.println("Hello "+msg);
	}
}
