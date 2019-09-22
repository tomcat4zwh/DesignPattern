package com.design.builder;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("高档房子建地基！！");
	}

	@Override
	public void buildWall() {
		System.out.println("高档房子建墙壁！！");
	}

	@Override
	public void buildRoof() {
		System.out.println("高档房子建屋顶！！");
		
	}
}
