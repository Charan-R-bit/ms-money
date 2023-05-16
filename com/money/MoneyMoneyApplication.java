package com.money;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MoneyMoneyApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(MoneyMoneyApplication.class, args);
	}

}
