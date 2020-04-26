package com.fanshe.day01;

import java.util.ArrayList;

/**
 * 获取一个类的class文件对象的三种方式
 * 1.对象获取
 * 2.类名获取
 * 3.Class类的静态方法获取
 * @author Leemi
 *
 */
public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//1.通过该类的对象获取
		Person p = new Person();
		Class class1 = p.getClass();
		System.out.println(class1);
		
		//2.通过类名获取
		Class class2 = Person.class;
		System.out.println(class2);
		System.out.println(Double.class);
		System.out.println(String.class);
		System.out.println(ArrayList.class);
		
		//3.Class类的静态方法获取
		Class class3 = Class.forName("com.fanshe.day01.Person");//一定要写全路径
		System.out.println(class3);
		System.out.println(Class.forName("java.util.Calendar"));
	}
}

