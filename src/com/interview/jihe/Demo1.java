package com.interview.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 集合类不安全问题,举例ArrayList
 * @author Leemi
 *
 */
public class Demo1 {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();//线程不安全
//		List<String> list = new Vector<>();//线程安全
//		List<String> list = Collections.synchronizedList(new ArrayList<>());//线程安全
		List<String> list = new CopyOnWriteArrayList<>();
		
		for( int i=1; i<=30; i++ ) {
			new Thread(()->{
				list.add(UUID.randomUUID().toString().substring(0, 8));
				System.out.println(list);
			}).start();
		}
		
		//java.util.ConcurrentModificationException并发修改异常
	}
}
