package com.designPattern.bridge.day02;

public class Square extends Shape{

	public Square(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		super.color.paint("正方形");
	}

}
