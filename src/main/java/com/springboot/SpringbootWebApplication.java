package com.springboot;

import com.springboot.rabbitMqUtils.RabbitConntion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpEncodingProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@SpringBootApplication
public class SpringbootWebApplication {

	public static void main(String[] args) throws IOException, TimeoutException {
		SpringApplication.run(SpringbootWebApplication.class, args);
		System.out.println(RabbitConntion.getConnection());
	}

}
