package com.designPattern.bridge.day02;

/**
 * 形状的抽象类
 * @author Leemi
 *
 */
public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	protected abstract void draw() ;
}
