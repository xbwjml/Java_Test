package com.yangGe.JUC.day01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 15 - 22:41
 */
public class Demo1 {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                //...
//            }
//        },"窗口1").start();

        new Thread( ()->{for(int i=1; i<41; i++) ticket.sale();},"窗口A" ).start();
        new Thread( ()->{for(int i=1; i<41; i++) ticket.sale();},"窗口B" ).start();
        new Thread( ()->{for(int i=1; i<41; i++) ticket.sale();},"窗口C" ).start();

    }
}

class Ticket{

    private int number = 30;

    private Lock lock = new ReentrantLock();

    public synchronized void sale(){
        lock.lock();
        try{
            if( number>0 ){
                System.out.println(Thread.currentThread().getName()+
                    "卖出第:"+(number--)+"张，还剩下:"+number);
            }
        }finally {
            lock.unlock();
        }
    }


}