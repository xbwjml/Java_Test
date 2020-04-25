package com.IOSenior.day02;

import java.util.Properties;
import java.util.Set;

/**
 * Properties:表示了一个持久的属性集，属性列表中每个键及其对应值都是字符串
 * @author leemj
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		
		//创建属性列表对象
		Properties prop = new Properties();
		
		//添加映射关系
		prop.put("001", "张三");
		prop.put("002", "里斯");
		prop.put("003", "王武");
		
		//遍历属性对象
		Set<Object> keys = prop.keySet();
		for( Object key : keys ) {
			System.out.println( key+"==="+prop.get(key) );
		}
		
	}
}
