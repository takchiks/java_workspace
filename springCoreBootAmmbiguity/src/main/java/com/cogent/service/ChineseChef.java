package com.cogent.service;

import org.springframework.stereotype.Component;

@Component
public class ChineseChef implements InternationalChef{

	@Override
	public void someFood() {
		// TODO Auto-generated method stub
		System.out.println("Pad Thai");
		
	}
	

}
