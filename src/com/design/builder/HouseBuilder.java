package com.design.builder;

public abstract class HouseBuilder {
	
	private House house = new House();

	public abstract void buildBasic();
	public abstract void buildWall();
	public abstract void buildRoof();
	
	public House buildHouse() {
		return house;
	}
	
}
