package com.design.builder;

public class Director {
	
	private HouseBuilder builder;

	public Director(HouseBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public House buildHouse() {
		builder.buildBasic();
		builder.buildWall();
		builder.buildRoof();
		return builder.buildHouse();
	}
}
