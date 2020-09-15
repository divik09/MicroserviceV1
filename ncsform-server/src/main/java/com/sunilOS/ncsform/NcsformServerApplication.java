package com.sunilOS.ncsform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NcsformServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NcsformServerApplication.class, args);
	}

}
