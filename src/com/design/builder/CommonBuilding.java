package com.design.builder;

public class CommonBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("普通房子建地基！！");
	}

	@Override
	public void buildWall() {
		System.out.println("普通房子建墙壁！！");
	}

	@Override
	public void buildRoof() {
		System.out.println("普通房子建屋顶！！");
	}

}
