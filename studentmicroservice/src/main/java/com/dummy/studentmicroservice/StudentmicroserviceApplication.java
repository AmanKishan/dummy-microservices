package com.dummy.studentmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableConfigurationProperties
@RefreshScope
@ComponentScan
public class StudentmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmicroserviceApplication.class, args);
	}

}
