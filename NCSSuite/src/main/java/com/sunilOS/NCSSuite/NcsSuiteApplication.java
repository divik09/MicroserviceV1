package com.sunilOS.NCSSuite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NcsSuiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcsSuiteApplication.class, args);
	}

}
