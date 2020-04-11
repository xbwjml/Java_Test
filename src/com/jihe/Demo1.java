package com.jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 10 - 18:48
 */
public class Demo1 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("Hello");
        c.add("World");
        c.add("Java");

        //获取迭代器对象
        Iterator it = c.iterator();

        //遍历
        while ( it.hasNext() ){
            System.out.println(it.next());
        }
    }
}
