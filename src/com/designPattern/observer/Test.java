package com.designPattern.observer;

public class Test {
	public static void main(String[] args) {
		//前台为通知者
		Secretary secretary = new Secretary();
		
		StockObserver observer1 = new StockObserver("员工甲", secretary);
		StockObserver observer2 = new StockObserver("员工乙", secretary);
		
		//前台通知
		secretary.attach(observer1);
		secretary.attach(observer2);
		
		secretary.detach(observer2);
		
		secretary.setAction("小心！ Boss 回来了!");
		
		//发通知
		secretary.notifyAllObservers();
	}
}
