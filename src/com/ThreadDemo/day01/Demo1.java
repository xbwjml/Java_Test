package com.ThreadDemo.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 15 - 15:27
 */
public class Demo1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1(); //创建线程实例
        t1.start(); //启动线程
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread1运行");
    }
}