package com.extend.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 16:08
 */
public class Demo3 {
    public static void main(String[] args) {
        Kid k = new Kid();
        k.eat();
    }
}

class Father{
    public void eat(){
        System.out.println("小酌两口");
    }
}

class Kid extends Father {
    public void eat(){
        System.out.println("喝牛奶");
    }
}
