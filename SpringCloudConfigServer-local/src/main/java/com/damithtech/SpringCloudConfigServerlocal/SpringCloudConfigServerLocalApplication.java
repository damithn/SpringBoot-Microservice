package com.damithtech.SpringCloudConfigServerlocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerLocalApplication.class, args);
	}

}
