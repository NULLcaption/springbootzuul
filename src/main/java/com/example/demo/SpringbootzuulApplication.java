package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@EnableZuulProxy //zuul服务
@SpringBootApplication
public class SpringbootzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootzuulApplication.class, args);
	}

	/**
	 * @Description Ribbon寻轮方式
	 * @Author xg.chen
	 * @Date 10:37 2021/5/24
	 **/
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
