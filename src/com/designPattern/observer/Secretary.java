package com.designPattern.observer;

import java.util.LinkedList;
import java.util.List;

//具体通知者
public class Secretary implements Subject {

	// 同事列表
	private List<Observer> observers = new LinkedList<>();
	private String action;

	@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer o:observers) {
			o.update();
		}
	}

	@Override
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String getAction() {
		return action;
	}

}
