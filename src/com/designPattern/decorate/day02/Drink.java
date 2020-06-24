package com.designPattern.decorate.day02;

/**
 * 饮料抽象类
 * @author Leemi
 *
 */
public abstract class Drink {
	private String des ;
	
	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	public abstract float cost();
}
