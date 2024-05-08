package com.auth.springauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication	
@EnableDiscoveryClient
@PropertySource("file:${user.dir}/.env")
public class SpringAuthApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(SpringAuthApplication.class, args);
	}

}
