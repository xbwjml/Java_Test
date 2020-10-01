package com.java8New.ref;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * 一. 方法引用:
 * 		若lambda体中的内容有方法已经实现了,可以使用"方法引用"
 * 
 * 主要有3种格式:
 * 		1.对象::实例方法名
 * 		2.类名::静态方法名
 * 		3.类名::实例方法名
 *
 *
 *二. 构造器引用
 *		格式: className::new
 *
 *三. 数组引用
 *		格式: Type[]::new
 */
public class Demo1 {

	//对象::实例方法名
	@Test
	public void test1() {
		PrintStream ps = System.out;
		Consumer<String> con = x -> ps.println(x);
		//改成方法引用
		PrintStream ps1 = System.out;
		Consumer<String> con1 = ps1::println;
	}
	
	//类:静态方法名
	@Test
	public void test2() {
		Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
		Comparator<Integer> com1 = Integer::compare;
	}
	
	//类:实例方法名
	@Test
	public void test3() {
		BiPredicate<String,String> bp = (x,y) -> x.equals(y);
		BiPredicate<String,String> bp1 = String::equals;
	}
	
	//构造器引用
	@Test
	public void test4() {
		Supplier<Object> sup = ()->new Object();
		Supplier<Object> sup1 = Object::new;
	}
	
	//数组引用
	@Test
	public void test5() {
		Function<Integer,String[]> fun = (x) -> new String[x];
		Function<Integer,String[]> fun1 = String[]::new;
	}

}
