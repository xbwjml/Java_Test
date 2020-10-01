package com.netty.BIO;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) {
		
		int x = 123;
        List<Integer> list = new LinkedList<Integer>();
        
        while( x!=0 ){
            int temp = x%10;
            list.add(temp);
            x /= 10;
        }
        
        System.out.println(list);
        
        int res = 0;
        for( int i=0; i<list.size(); i++ ) {
        	res += list.get(i) * Math.pow(10, list.size()-1-i);
        }
        
        System.out.println(res);
        
        char[] charArray = "Hello".toCharArray();
        System.out.println("world".charAt(1));
        System.out.println("Hello".substring(1, 3));
        
	}
}
