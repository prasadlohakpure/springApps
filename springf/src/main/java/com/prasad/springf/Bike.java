package com.prasad.springf;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void Run() {
		System.out.print("Bike runs");
	}
}