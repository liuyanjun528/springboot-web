package com.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@ConfigurationProperties(prefix="lyj")
public class Order {
	private  String name;
	public String  order(String name) {
		return name+"的订单";
	}
}
