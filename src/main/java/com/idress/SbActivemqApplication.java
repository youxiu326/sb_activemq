package com.idress;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Destination;

@SpringBootApplication
public class SbActivemqApplication {

	@Bean
	public Destination queue() {
		return new ActiveMQQueue("测试队列001");
	}

	public static void main(String[] args) {
		SpringApplication.run(SbActivemqApplication.class, args);
	}
}
