package com.designPattern.decorate.day01;

/**
 * 饮料抽象类
 * @author Leemi
 *
 */
public abstract class Drink {
	
	public String des;//描述
	private float price = 0.0f;//价格
	
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	//计算费用的抽象方法
	public abstract float cost();
}
