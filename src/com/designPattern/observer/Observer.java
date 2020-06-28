package com.designPattern.observer;

//观察者抽象类
public abstract class Observer {
	protected String name;
	protected Subject subject;

	public Observer(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	public abstract void update();
}
