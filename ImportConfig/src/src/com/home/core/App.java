package src.com.home.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import src.com.home.config.AppConfig;

public class App
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		CustomerBO cust = (CustomerBO) context.getBean("cust");
		cust.printMsg(" heelo 1");
		SchedulerBO schedule = (SchedulerBO) context.getBean("schd");
		schedule.printMsg("poda dei");
	}

}
