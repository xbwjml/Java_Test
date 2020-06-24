package com.designPattern.decorate.day01;

public class Decorator extends Drink{
	
	private Drink obj;
	
	public Decorator(Drink obj) {
		this.obj = obj;
	}

	@Override
	public float cost() {
		return super.getPrice()+obj.getPrice();
	}
	
	@Override
	public String getDes() {
		return super.des+" "+super.getPrice()+" && "+obj.getDes();
	}

}
