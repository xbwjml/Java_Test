package com.fanshe.day01;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 编译后的class文件中是没有泛型约束的
 * 实用意义不大，主要考察对反射的掌握程度
 * @author Leemi
 *
 */
public class Demo7 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		
		//获得ArrayList类的class文件对象
		Class c = list.getClass();
		//获取ArrayList.class中的add()方法
		Method m = c.getMethod("add", Object.class);
		m.invoke(list, 10);
		m.invoke(list, 10.5);
		m.invoke(list, 'x');
		
		System.out.println(list);
	}
}
