package src.com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import src.com.home.core.SchedulerBO;

@Configuration
public class SchedulerConfig
{

	@Bean(name="schd")
	public SchedulerBO suchedulerBo()
	{
		return new SchedulerBO();
	}
	
}
