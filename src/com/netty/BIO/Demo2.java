package com.netty.BIO;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put(null, "v1");
		map.put(null, "v2");
		map.put(null, "v3");
		System.out.println(map);
	}
}
