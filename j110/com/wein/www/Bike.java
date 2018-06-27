package com.wein.www;

public class Bike implements Vehicle {

	@Override
	public void Start() {
		System.out.println("Bike is Start");
	}

	@Override
	public void Stop() {
		System.out.println("Bike is Stop");
	}

}
