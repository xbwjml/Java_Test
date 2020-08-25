package com.java8New.lambda.day01;

import java.util.Comparator;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * lambda表达式：
 * 		java8中引入了一个新的操作符 "->",
 * 		该符号称为箭头操作符或lambda操作符，
 * 		箭头操作符将lambda表达式拆分为两部分
 * 	左侧:lambda表达式的参数列表;
 *  右侧:lambda体;
 *  	
 *  lambda表达式需要函数式接口
 *  	若接口中只有一个抽象方法,
 *  	那么就称之为函数式接口。
 *      可以使用注解@FunctionalInterface修饰,
 *      @FunctionalInterface修饰的接口必须有且只能有一个抽象方法
 */
public class Demo2 {

	/**
	 * 语法格式1: 无参数，无返回值
	 * 		() -> System.out.println("Hello");
	 */
	@Test
	public void test1() {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello1");
			}
		};
		
		Runnable r2 = ()-> System.out.println("Hello2");
		r1.run();
		r2.run();
	}
	
	/**
	 * 语法格式2：有一个参数，无返回值
	 * 		(x) -> System.out.println(x);
	 * 		若只有一个参数，小括号可以不写
	 */
	@Test
	public void test2() {
//		Consumer<String> con = (x) -> System.out.println("test2  "+x);
		//若只有一个参数，小括号可以不写
		Consumer<String> con = x -> System.out.println("test2  "+x);
		con.accept("666");
	}
	
	/**
	 * 语法格式3:有多个参数，并且lambda体中有多条语句
	 */
	@Test
	public void test3() {
		Comparator<Integer> comp = (x,y) -> {
			System.out.println("hello");
			System.out.println("world");
			System.out.println("java");
			return Integer.compare(x, y);
		};
		
		Integer res = comp.compare(111, 222);
		System.out.println(res);
	}
	
	/**
	 * 语法格式4:有返回值，但lambda体中只有一条语句，那么return和大括号可以不写
	 */
	@Test
	public void test4() {
		Comparator<Integer> comp = (x,y) -> Integer.compare(x, y);
		Integer res = comp.compare(222, 66);
		System.out.println(res);
	}
	
	/**
	 * 语法格式6:参数的数据类型可以不写，
	 * 		       因为jvm编译器通过上下文推断出数据类型,
	 *         
	 */
}
