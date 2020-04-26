package com.fanshe.day01;

import java.lang.reflect.Field;

public class Demo5 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.fanshe.day01.Person");
		
		//获得所有public成员变量
		Field[] fields = c.getFields();
		for( Field f : fields ) {
			System.out.println(f);
		}
		
		//获得指定public成员变量
		Field f = c.getField("address");
		Object obj = c.newInstance();
		f.set(obj, "张江");
		System.out.println(obj);
		
		//注： 获取private成员变量参照上面
	}
}
