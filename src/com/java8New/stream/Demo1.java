package com.java8New.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * 一. 创建Stream流的三个操作
 * 
 *   1.创建Stream
 *   
 *   2.中间操作
 *   
 *   3.终止操作
 *
 */
public class Demo1 {
	
	//创建Stream
	@Test
	public void test01() {
		//1.通过Collection
		List<String> list = new ArrayList<>();
		Stream<String> stream1 = list.stream();
		//2.通过Arrays中的静态方法 stream() 获取数组流
		Object[] arr = new Object[10];
		Stream<Object> stream2 = Arrays.stream(arr);
		//3.通过Stream中的静态方法  of()
		Stream<String> stream3 = Stream.of("AA","BB","CC");
		//4.创建无限流
		//迭代
		Stream<Integer> stream4 = Stream.iterate(0, (x)->x+2);
		stream4.limit(10)
			   .forEach(System.out::println);
		//生成
		Stream.generate(()->Math.random())
				.limit(5)
				.forEach(System.out::println);
	}
}
