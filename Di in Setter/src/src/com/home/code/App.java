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
		ApplicationContext context = new ClassPathXmlApplicationContext("src/resources/MySpring-Config.xml");
		HelperClass hc= (HelperClass)context.getBean("userBean");
		hc.getTask();
	}

}
