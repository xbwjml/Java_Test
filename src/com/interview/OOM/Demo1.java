package com.interview.OOM;

/**
 * StackOverFlowError
 * @author Leemi
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		method();
	}

	private static void method() {
		method();
	}
}
