package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 23 - 17:05
 */
public class Demo5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("001","张三");
        map.put("002","里斯");
        map.put("003","王五");

        System.out.println(map);

        Set<String> keys = map.keySet();//获取所有的key
        System.out.println(keys);

        Collection<String> values = map.values();//获取所有value
        System.out.println(values);
    }
}
