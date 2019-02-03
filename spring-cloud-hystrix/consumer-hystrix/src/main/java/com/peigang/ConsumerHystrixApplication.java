package com.peigang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerHystrixApplication.class, args);
	}

	//配置bean
	@Bean
	//开启负载均衡
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}

