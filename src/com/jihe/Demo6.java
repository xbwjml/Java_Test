package com.jihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 23 - 17:57
 */
public class Demo6 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        map.put("张无忌","赵敏");


        //方式1.先获取所有的key,再通过key找value
        //获取key的集合
        Set<String> keys = map.keySet();
        //遍历key获取value
        for ( String key : keys) {
            System.out.println(key+"==="+map.get(key));
        }


        //方式2.通过values()方法获取到所有的key,但是没法获取对应的key


        //方式3.通过“结婚证”来获取key和value
        //获取结婚证对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历结婚证对象集合
        for ( Map.Entry<String,String> entry: entries) {
            System.out.println(entry.getKey()+"+++"+entry.getValue());
        }
    }
}
