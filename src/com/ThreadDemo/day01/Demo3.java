package com.ThreadDemo.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 15 - 15:59
 */
public class Demo3 {
    public static void main(String[] args) {

        //创建线程实例
        MyThreadd mt = new MyThreadd();
        Thread t1 = new Thread(mt);
        t1.setName("哈哈哈");

        //启动线程
        t1.start();
    }
}

class MyThreadd implements Runnable{
    @Override
    public void run() {
        for ( int i=0; i<100; i++ ){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
