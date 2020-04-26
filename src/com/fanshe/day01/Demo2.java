package com.fanshe.day01;

import java.lang.reflect.Constructor;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("com.fanshe.day01.Person");
		
		//获取public空参构造方法
		Constructor con =  c.getConstructor();
		System.out.println(con);
		//运行空参数构造方法
		Object obj = con.newInstance();
		System.out.println(obj);
		
		//获取public有参构造
		Constructor con2 = c.getConstructor(String.class,int.class);
		System.out.println(con2);
		//运行有参构造方法
		Object obj2 = con2.newInstance("张三",18);
		System.out.println(obj2);
	}
}
