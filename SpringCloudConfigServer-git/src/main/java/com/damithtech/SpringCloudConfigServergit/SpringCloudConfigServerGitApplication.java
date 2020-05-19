package com.damithtech.SpringCloudConfigServergit;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerGitApplication.class, args);
	}

}
