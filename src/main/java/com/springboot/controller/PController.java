package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Order;

@RestController
public class PController {
	@Autowired
	Order order;
	@GetMapping("method")
	public String method() {
		return order.getName();
	}
}
