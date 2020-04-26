package com.fanshe.day01;

/**
 * 反射获取构造方法并运行，有快捷方式
 * 前提：
 * 		被反射的类必须有public空参构造
 * @author Leemi
 *
 */
public class Demo3 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.fanshe.day01.Person");
		Object obj = c.newInstance();
		System.out.println(obj);
	}
}
