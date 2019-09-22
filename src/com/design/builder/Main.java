package com.design.builder;

/*
 * ������ģʽ
 */
public class Main {

	public static void main(String[] args) {
		Director director1 = new Director(new CommonBuilding());
		director1.buildHouse();
		
		System.out.println("***************");
		
		Director director2 = new Director(new HighBuilding());
		director2.buildHouse();
		
	}
}
