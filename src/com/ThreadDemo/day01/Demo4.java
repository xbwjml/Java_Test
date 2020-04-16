package com.ThreadDemo.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 15 - 16:34
 */
public class Demo4 {
    public static void main(String[] args) {
        Ticket tick = new Ticket();

        Thread t1 = new Thread(tick);
        Thread t2 = new Thread(tick);
        Thread t3 = new Thread(tick);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class Ticket implements Runnable{

    int tickets = 100; //火车票总数
    Object obj = new Object();

    @Override
    public void run() {
        //出售火车票
        while ( true ){
            sell();
        }
    }

    private synchronized void sell(){

            //火车票小于0就停止售票
            if ( tickets > 0 ){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"窗口"+tickets--);
            }
    }
}
