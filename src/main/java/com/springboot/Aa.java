package com.springboot;

import org.springframework.stereotype.Component;

@Component
public class Aa  implements A{

	@Override
	public void a() {
	System.out.println("A的实现类");
		
	}

}
