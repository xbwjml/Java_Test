package com.interview.reference;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Demo4 {
	public static void main(String[] args) {
		myHashMap();
		System.out.println("=============");
		myWeakHashMap();
	}

	private static void myHashMap() {
		HashMap<Integer, String> map = new HashMap<>();
		
		Integer key = new Integer(666);
		String  value = "Hello";
		map.put(key, value);
		System.out.println(map);
		
		key = null;
		System.out.println(map);
		
		System.gc();
		System.out.println(map+"\t "+map.size());
	}
	
	private static void myWeakHashMap() {
		WeakHashMap<Integer, String> map = new WeakHashMap<>();
		
		Integer key = new Integer(777);
		String  value = "WeakHello";
		map.put(key, value);
		System.out.println(map);
		
		key = null;
		System.out.println(map);
		
		System.gc();
		System.out.println(map+"\t "+map.size());
		
	}
}
