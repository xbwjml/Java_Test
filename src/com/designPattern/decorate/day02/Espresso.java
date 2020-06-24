package com.designPattern.decorate.day02;

/**
 * 意式特浓咖啡
 * @author Leemi
 *
 */
public class Espresso extends Drink{
	public Espresso() {
		this.setDes("意式浓缩");
	}
	@Override
	public float cost() {
		return 2.3f;
	}
}
