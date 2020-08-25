package com.redis.day01;

import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

public class Test1 {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("49.235.62.25", 6379);
		String res = jedis.ping();
		System.out.println(res);
		jedis.set("keyFromPC", "yoho");
		String value = jedis.get("keyFromPC");
		System.out.println(value);
		Map<String, String> hgetAll = jedis.hgetAll("hashTest1");
		System.out.println(hgetAll);
		
		Transaction transaction = jedis.multi();
		try {
			transaction.sadd("", "");
			List<Object> list = transaction.exec();
		}catch( Exception e ) {
			transaction.discard();
		}finally {
			jedis.close();
		}
		
		
	}
}
