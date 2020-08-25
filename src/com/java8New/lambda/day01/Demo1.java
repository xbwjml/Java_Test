package com.java8New.lambda.day01;

import java.util.Comparator;
import java.util.TreeSet;

import org.junit.Test;

public class Demo1 {

	//传统的匿名内部类写法
	@Test
	public void test1() {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(o1, o2);
			}
		};
		
		TreeSet<Integer> treeSet = new TreeSet<>(comparator);
	}
	
	//lambda表达式写法
	@Test
	public void test2() {
		Comparator<Integer> comparator = (x,y)-> Integer.compare(x, y);
		TreeSet<Integer> treeSet = new TreeSet<>(comparator);
	}
	
}
