package com.designPattern.observer;

//通知者接口
public interface Subject {
	
	//增加
	public void attach(Observer o) ;
	
	//删除
	public void detach(Observer o) ;
	
	//通知
	public void notifyAllObservers();
	
	//状态
	public void setAction(String action);
	public String getAction();
}
