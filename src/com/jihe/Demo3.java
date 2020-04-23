package com.jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 21 - 23:34
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> set = new HashSet<String>();
        //添加元素
        set.add("Hello");
        set.add("World");
        set.add("Java");
        set.add(null);
        set.add(null);
        set.add(null);

        //遍历

        //1.转数组
//        Object[] arr = set.toArray();
//        for( int i=0; i<arr.length; i++ ){
//            System.out.println(arr[i]);
//        }

        //2.迭代器
//        Iterator<String> it = set.iterator();
//        while ( it.hasNext() ){
//            System.out.println(it.next());
//        }

        //3.增强for
        for ( String s : set) {
            System.out.println(s);
        }

    }
}



