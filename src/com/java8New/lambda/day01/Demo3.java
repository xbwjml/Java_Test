package com.java8New.lambda.day01;

import org.junit.Test;

public class Demo3 {

	@Test
	public void test1() {
		String res = strHandler("ABC", s-> s.toLowerCase());
		System.out.println(res);
	}
	
	//需求；用于处理字符串
	public String strHandler( String s, MyFunI mf ) {
		return mf.getVal(s);
	}
}
