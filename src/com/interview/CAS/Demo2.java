package com.interview.CAS;

import java.util.concurrent.atomic.AtomicReference;

public class Demo2 {
	public static void main(String[] args) {
		User u1 = new User("张三",18);
		User u2 = new User("李四",19);
		AtomicReference<User> atomicReference = new AtomicReference<>();
		atomicReference.set(u1);
		
		System.out.println(atomicReference.compareAndSet(u1, u2)+"\t "+atomicReference.get().toString());
		System.out.println(atomicReference.compareAndSet(u1, u2)+"\t "+atomicReference.get().toString());
	}
}


class User{
	String name;
	int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}
