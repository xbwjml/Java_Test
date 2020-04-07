package com.extend.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 15:52
 */
public class Demo2 {
    public static void main(String[] args) {
        Son s = new Son();
        s.show();
    }
}

class Dad {
    String name = "父亲";
}

class Son extends Dad{
    String name = "儿子";
    public void show(){
        String name = "局部名字";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
}