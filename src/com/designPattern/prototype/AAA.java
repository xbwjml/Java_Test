package com.designPattern.prototype;

import java.io.Serializable;

public class AAA implements Cloneable, Serializable{
	private String name;
	private int age;
	
	public AAA() {
		super();
		System.out.println("AAA的无参构造");
	}

	public AAA(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("AAA的有参构造");
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
	protected Object clone()  {
		AAA aaa = null;
        try {
            aaa = (AAA) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return aaa;
	}
	
}
