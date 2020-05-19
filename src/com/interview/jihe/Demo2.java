package com.interview.jihe;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合类不安全问题，举例HashSet
 * @author Leemi
 *
 */
public class Demo2 {
	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();//线程不安全
		Set<String> set = new CopyOnWriteArraySet<>();//线程安全
		
		for( int i=1; i<=30; i++ ) {
			new Thread(()->{
				set.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(set);
			}).start();
		}
	}
}
