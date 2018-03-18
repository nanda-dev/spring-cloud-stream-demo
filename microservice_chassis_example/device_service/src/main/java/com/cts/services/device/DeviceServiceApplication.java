package com.cts.services.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableCircuitBreaker
//@EnableDiscoveryClient
@SpringBootApplication(exclude={RabbitAutoConfiguration.class})
@EnableSwagger2
public class DeviceServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(DeviceServiceApplication.class, args);
	}
}
