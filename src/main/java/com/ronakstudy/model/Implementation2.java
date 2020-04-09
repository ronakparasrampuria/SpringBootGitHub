package com.ronakstudy.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("implemen2")
public class Implementation2 implements TestInterface {

	@Override
	public void display() {
		System.out.println("Implementation2");
	}

}
