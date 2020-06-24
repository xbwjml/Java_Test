package com.designPattern.prototype;

public class SheepTest {
	public static void main(String[] args) {
		Sheep sheep = new Sheep("Tom", 3, "白色");
		Sheep sheep2 = (Sheep) sheep.clone();
		System.out.println(sheep.hashCode());
		System.out.println(sheep2.hashCode());
		
	}
}
