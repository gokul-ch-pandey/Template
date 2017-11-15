package com.hikex.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.hikex.webservice.service","com.hikex.webservice.controller"})
public class SpringBootWebServiceTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebServiceTemplateApplication.class, args);
	}
}
