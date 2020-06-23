package com.designPattern.bridge.day02;

public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		super.color.paint("圆形");
	}

}
