package com.designPattern.decorate.day01;

public class Coffee extends Drink{

	@Override
	public float cost() {
		return super.getPrice();
	}

}
