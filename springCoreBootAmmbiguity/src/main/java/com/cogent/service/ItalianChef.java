package com.cogent.service;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements InternationalChef {

	@Override
	public void someFood() {
		// TODO Auto-generated method stub
		System.out.print("Pistacio Frappaucino");
		
	}

}
