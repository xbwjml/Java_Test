package com.object;

public class Demo1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("张三",18);
		Person p3 = (Person) p1.clone();
		
		System.out.println(p1+"----"+p1.getName()+"="+p1.getAge());
		System.out.println(p3+"----"+p3.getName()+"="+p3.getAge());
		System.out.println(p1.getName() == p3.getName());
	}
}

class Person implements Cloneable{
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
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
	@Override
	public Object clone() throws CloneNotSupportedException  {
		return  super.clone();
	}
}
