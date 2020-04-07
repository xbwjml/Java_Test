package com.extend.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 16:39
 */
public class Demo5 {
    public static void main(String[] args) {
//        Die d = new Die();
        ErZi z = new ErZi();
    }
}

class Die{
    public Die(){
        System.out.println("我是父类无参构造");
    }
    public Die(int num){
        System.out.println("我是父类有参构造");
    }
}

class ErZi extends Die{
    public ErZi(){
//        super(1);
        this(1);
        System.out.println("我是子类无参构造");
    }
    public ErZi(int num){
        super(1);
        System.out.println("我是子类有参构造");
    }
}
