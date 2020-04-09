package com.ronakstudy.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("implemen1")
public class Implementation1 implements TestInterface {

	@Override
	public void display() {
		System.out.println("Implementation1");
		
	}

}
