package com.designPattern.decorate.day02;

public class Test {
	public static void main(String[] args) {
		
		//来一杯Espresso(或者换成LongBlack也行)
		Drink drink = new Espresso();
		System.out.println("状态1: "+drink.getDes()+" $ "+drink.cost());
		
		//加牛奶
		drink = new Milk(drink);
		System.out.println("状态2: "+drink.getDes()+" $ "+drink.cost());
		
		//加巧克力
		drink = new Chocolate(drink);
		System.out.println("状态3: "+drink.getDes()+" $ "+drink.cost());
	}
}
