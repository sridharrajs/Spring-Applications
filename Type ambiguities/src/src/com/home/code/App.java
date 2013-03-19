package src.com.home.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ApplicationContext txt=new ClassPathXmlApplicationContext("src/resources/Spring-Config.xml");
		Customer cust= (Customer) txt.getBean("findme");
		System.out.println(cust);
	}

}
