package com.fanshe.day01;

import java.lang.reflect.Constructor;

public class Demo4 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.fanshe.day01.Person");
		
		//获得所有构造方法，包括私有的
		Constructor[] cons = c.getDeclaredConstructors();
		for( Constructor con : cons ) {
			System.out.println(con);
		}
		
		//获得指定的私有构造
		Constructor con = c.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		System.out.println(con.newInstance("张三"));
	}
}
