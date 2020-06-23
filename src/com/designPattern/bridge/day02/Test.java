package com.designPattern.bridge.day02;

public class Test {
	public static void main(String[] args) {
		
		//现在就可以组合任意形状和颜色了
		
		Shape shape1 = new Square(new White());
		shape1.draw();
		
		Shape shape2 = new Square(new Black());
		shape2.draw();
		
		Shape shape3 = new Circle(new Blue());
		shape3.draw();
		
	}
}
