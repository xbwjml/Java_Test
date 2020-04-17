package com.yangGe.JUC.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 17 - 22:27
 */
public class Demo2 {
    public static void main(String[] args) {
        Impl t = new Impl();
        t.method1();
        t.method2();
        IA.method3();
    }
}

interface IA{
    void method1();//抽象方法

    public default void method2(){
        System.out.println("可以有default修饰的实体方法");
    }

    static void method3(){
        System.out.println("可有static修饰的方法，由接口名直接调用");
    }
}

class Impl implements IA{

    @Override
    public void method1() {
        System.out.println("抽象方法必须重写");
    }

    public void method2(){
        System.out.println("接口中default修饰的方法可以被子类重写，"
                            +"也可以不重写"
                            +"若没有重写，则子类对象调用的就是接口中的方法"
                          );
    }

}
