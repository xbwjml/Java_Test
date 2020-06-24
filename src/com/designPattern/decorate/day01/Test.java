package com.designPattern.decorate.day01;

public class Test {
	public static void main(String[] args) {
		
		//先点一份LongBlack;
		Drink order = new LongBlack();
		System.out.println("费用1 = "+order.cost() +", 描述："+order.getDes());
		
		//2.加入一份牛奶
		order = new Milk(order);
		System.out.println("费用2 = "+order.cost() +", 描述："+order.getDes());
		
		//3.再加入一份巧克力
		order = new Chocolate(order);
		System.out.println("费用3 = "+order.cost() +", 描述："+order.getDes());
	}
}
