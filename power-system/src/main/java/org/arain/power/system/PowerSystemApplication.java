package org.arain.power.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PowerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerSystemApplication.class, args);
	}
}
