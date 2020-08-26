package com.java8New.lambda.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * Java8 内置的四大核心函数式接口
 * Consumer<T> :消费型接口
 * 		void accecpt(T t)
 * 
 * Supplier<T> :供给型接口
 * 		T  get()
 * 
 * Function<T, R> :函数型接口
 * 		R  apply(T t)
 * 
 * Pridicate<T>	:断言型接口
 * 		boolean test(T t)
 */
public class Demo4 {
	
	//Consumer<T> :消费型接口
	//void accecpt(T t)
	@Test
	public void test1() {
		happy(998F, m -> System.out.println("大保健,每次 "+m+" 元") );
	}
	
	public void happy( double money, Consumer<Double> con ) {
		con.accept(money);
	}

	
	//Supplier<T> :供给型接口
	//get()
	@Test
	public void test2() {
		List<Integer> res = getNumList(10, ()->(int)(Math.random()*100));
		System.out.println(res);
	}
	
	public List<Integer> getNumList(int num, Supplier<Integer> supplier){
		List<Integer> list = new ArrayList<>();
		for( int i=0; i<num; i++ ) {
			list.add(supplier.get());
		}
		return list;
	}
	
	//Function<T, R> :函数型接口
	//  		R  apply(T t)
	@Test
	public void test3() {
		String res = handlerStr("WorLD",x->x.toLowerCase());
		System.out.println(res);
	}
	
	public String handlerStr(String str, Function<String,String> fun) {
		return fun.apply(str);
	}
	
	//Pridicate<T>	:断言型接口
	// 		boolean test(T t)
	@Test
	public void test4() {
		List<String> list = Arrays.asList("Hello","world","java");
		List<String> res = filterStr(list,x->x.length()>4);
		System.out.println(res);
	}
	
	public List<String> filterStr( List<String> list, Predicate<String> pre){
		List<String> strList = new ArrayList<>();
		for( String s : list ) {
			if(pre.test(s)) {
				strList.add(s);
			}
		}
		return strList;
	}
}
