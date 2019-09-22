package com.design.builder;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("�ߵ����ӽ��ػ�����");
	}

	@Override
	public void buildWall() {
		System.out.println("�ߵ����ӽ�ǽ�ڣ���");
	}

	@Override
	public void buildRoof() {
		System.out.println("�ߵ����ӽ��ݶ�����");
		
	}
}
