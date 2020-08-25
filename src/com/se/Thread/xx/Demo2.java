package com.se.Thread.xx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) {
		
		
	}
	
	//两个数组比较
	private static void method(int[] a, int[]b) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		//先把数组a的每一个元素放到一个list中
		for( int i=0; i<a.length; i++ ) {
			list.add(a[i]);
		}
		
		//遍历b数组
		for( int i=0; i<b.length; i++ ) {
			if( !list.contains(b[i]) ) {
				//如果list里面没有b[i],则输出N
				System.out.println("N");
				break;
			}
			if( list.contains(b[i]) ) {
				//如果list里面有b[i],则移除这个元素，进行下一轮比较
				list.remove(b[i]);
			}
		}
		
	}
	
	private static void method2(int[] a, int[]b) {
		Map<Integer,Integer> mapA = new HashMap<Integer,Integer>();
		Map<Integer,Integer> mapB = new HashMap<Integer,Integer>();
		
		for( int i=0; i<a.length; i++ ) {
			int key = a[i];
			int value = mapA.containsKey(a[i])?mapA.get(a[i])+1 :1;
			mapA.put(key, value);
		}
		
		for( int i=0; i<b.length; i++ ) {
			int key = b[i];
			int value = mapB.containsKey(a[i])?mapB.get(a[i])+1 :1;
			mapB.put(key, value);
		}
		
		Set<Integer> keySetA = mapA.keySet();
		Set<Integer> keySetB = mapB.keySet();
		
		if( keySetA.size() != keySetA.size() ) {
			System.out.println("N");
			return;
		}
		
		for( Integer i: keySetA) {
			if( !mapB.containsKey(i) ) {
				System.out.println("N");
				return;
			}
			if( i != mapB.get(i) ) {
				System.out.println("N");
				return;
			}
		}
		
		System.out.println("Y");
		
	}
}
