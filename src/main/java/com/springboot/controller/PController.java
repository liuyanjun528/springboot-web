package com.springboot.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.A;
import com.springboot.Order;

@RestController
public class PController {
	@Autowired
	Order order;
	@Autowired
	A a;
	@GetMapping("method")
	public String method(HttpServletResponse response,@RequestParam(value="sex",required=false)String  sex) throws InstantiationException, IllegalAccessException {
		a.a();
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.getProperties();
		System.out.println(System.getProperty("java.class.path"));
		Class<? extends A> class1 = a.getClass();
		Order newInstance = (Order)order.getClass().newInstance();//获得order的class对象。
		newInstance.setName("name");
		class1.getAnnotations();
		System.out.println(sex);
		//默认Content-Type: text/html;charset=UTF-8，所以可以解析html标签
		return "<h1>"+order.getName()+"你好啊"+"</h1>";
		
	}
}
