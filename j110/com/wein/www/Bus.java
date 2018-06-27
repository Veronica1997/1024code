package com.wein.www;

public class Bus implements Vehicle {
	@Override
	public void Start() {
		System.out.println("Bus is Start");
	}

	@Override
	public void Stop() {
		System.out.println("Bus is Stop");
	}

}
