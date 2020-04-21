package com.jihe;

import java.util.*;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 10 - 18:48
 */
public class Demo2 {
    public static void main(String[] args) {

//        Collection c = new ArrayList();
        List c = new ArrayList();
        c.add("Hello");
        c.add("World");
        c.add("Java");

        //获取迭代器对象
//        Iterator it = c.iterator();
//
//        //遍历
//        while ( it.hasNext() ){
//            if( (""+it.next()).equals("Java") ){
//                c.add("Android");
//            }
//        }


        ListIterator it = c.listIterator();
        while ( it.hasNext() ){
            if( "Java".equals(""+it.next()) ){
                it.add("Android");
            }
        }
        System.out.println(c);
    }
}
