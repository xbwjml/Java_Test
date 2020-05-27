package com.interview.reference;
/**
 * 强引用案例
 * @author Leemi
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		Object obj1 = new Object();//这样的定义默认就是强引用
		Object obj2 = obj1;;
		
		obj1 = null;
		System.gc();
		
		System.out.println(obj1);//为null
		System.out.println(obj2);//还是指向Object对象，没有被回收
	}
}
