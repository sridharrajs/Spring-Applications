package src.com.home.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import src.com.home.core.CustomerBO;

@Configuration
public class CustomerConfig
{
	@Bean(name="cust")
	public CustomerBO customerBo()
	{
		return new CustomerBO();
	}

}
