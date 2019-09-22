package com.design.builder;

public class CommonBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("��ͨ���ӽ��ػ�����");
	}

	@Override
	public void buildWall() {
		System.out.println("��ͨ���ӽ�ǽ�ڣ���");
	}

	@Override
	public void buildRoof() {
		System.out.println("��ͨ���ӽ��ݶ�����");
	}

}
