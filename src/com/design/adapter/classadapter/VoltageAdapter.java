package com.design.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{

	@Override
	public int output5V() {
		int src = output22V();
		int dest =src/44;
		return dest;
	}

}
