package com.fanshe.day01;

import java.lang.reflect.Method;

public class Demo6 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.fanshe.day01.Person");
		
		//获取所有public方法，包括继承的public方法。
		Method[] methods = c.getMethods();
		for( Method m : methods ) {
			System.out.println(m);
		}
		
		System.out.println("==============");
		
		//获得指定方法
		Method m = c.getMethod("eat", String.class);
		System.out.println(m);
		m.invoke(c.newInstance(), "奥利奥");
		
		//注：获得private方法参照上面
	}
}
