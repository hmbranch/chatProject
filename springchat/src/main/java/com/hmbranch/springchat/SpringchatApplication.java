package com.hmbranch.springchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringchatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringchatApplication.class, args);
	}

}
