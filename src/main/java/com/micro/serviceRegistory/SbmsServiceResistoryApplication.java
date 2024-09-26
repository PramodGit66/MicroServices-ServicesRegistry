package com.micro.serviceRegistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbmsServiceResistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsServiceResistoryApplication.class, args);
	}

}
