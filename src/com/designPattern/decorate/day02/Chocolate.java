package com.designPattern.decorate.day02;

/**
 * 巧克力调料类
 * @author Leemi
 *
 */
public class Chocolate extends Decorator{

	private Drink drink;
	
	public Chocolate(Drink drink) {
		this.drink = drink;
	}
	
	@Override
	public String getDes() {
		return this.drink.getDes()+","+" 巧克力";
	}

	@Override
	public float cost() {
		return this.drink.cost()+4.6f;
	}

}
