package com.designPattern.prototype;

public class Sheep implements Cloneable{
	private String name;
	private int age;
	private String color;
	Sheep friend;

	public Sheep() {
	}
	
	public Sheep(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
//	public Sheep(String name, int age, String color, Sheep friend) {
//		this.name = name;
//		this.age = age;
//		this.color = color;
//		this.friend = friend;
//	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//	public Sheep getFriend() {
//		return friend;
//	}
//	public void setFriend(Sheep friend) {
//		this.friend = friend;
//	}

	@Override
	protected Object clone()  {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sheep;
	}
	
}
