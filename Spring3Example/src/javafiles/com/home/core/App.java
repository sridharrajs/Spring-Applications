package javafiles.com.home.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		ApplicationContext context= new ClassPathXmlApplicationContext("/resources/SpringBeans.xml"); 
		HelloWorld helloworld =(HelloWorld) context.getBean("helloBean");
		helloworld.printHello();
	}

}
