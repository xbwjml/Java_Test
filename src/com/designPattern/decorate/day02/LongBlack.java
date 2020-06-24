package com.designPattern.decorate.day02;

/**
 * 美式咖啡
 * @author Leemi
 *
 */
public class LongBlack extends Drink{
	public LongBlack() {
		this.setDes("美式");
	}
	@Override
	public float cost() {
		return 8.8f;
	}
}
