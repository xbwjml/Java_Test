package com.designPattern.observer;

//具体观察者
public class StockObserver extends Observer{
	
	public StockObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void update() {
		System.out.println(subject.getAction() +"\n"+name+" 关闭股票界面，结束摸鱼");
	}

}
