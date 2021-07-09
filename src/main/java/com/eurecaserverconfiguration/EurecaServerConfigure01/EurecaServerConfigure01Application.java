package com.eurecaserverconfiguration.EurecaServerConfigure01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurecaServerConfigure01Application {

	public static void main(String[] args) {
		SpringApplication.run(EurecaServerConfigure01Application.class, args);
	}

}
