package com.interview.OOM;

import java.util.ArrayList;
import java.util.List;

/***
 * -Xms10m
 * -Xmx10m
 * -XX:+PrintGCDetails
 * -XX:MaxDirectMemorySize=5m
 * @author Leemi
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		int i=0;
		List<String> list = new ArrayList<>();
		
		try {
			while( true ) {
				list.add(String.valueOf(++i).intern());
			}
		} catch (Throwable t) {
			System.out.println("**************  i: "+i);
			t.printStackTrace();
			throw t;
		}
	}
}
