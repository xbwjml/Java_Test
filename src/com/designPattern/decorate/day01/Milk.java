package com.designPattern.decorate.day01;

public class Milk extends Decorator{

	public Milk(Drink obj) {
		super(obj);
		setDes("牛奶");
		setPrice(2.0f);
	}

}
