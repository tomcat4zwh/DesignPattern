package com.design.adapter.classadapter;

public class Client {

	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
		System.out.println("hot fix..............");
	}

}
