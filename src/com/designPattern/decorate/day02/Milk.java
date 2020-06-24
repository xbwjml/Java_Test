package com.designPattern.decorate.day02;

/**
 * 牛奶调料类
 * @author Leemi
 *
 */
public class Milk extends Decorator{
	
	private Drink drink;
	
	public Milk(Drink drink) {
		this.drink = drink;
	}

	@Override
	public String getDes() {
		return this.drink.getDes()+","+" 牛奶";
	}

	@Override
	public float cost() {
		return this.drink.cost() +1.1f;
	}

}
