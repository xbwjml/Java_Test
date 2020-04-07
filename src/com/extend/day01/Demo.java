package com.extend.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 15:40
 */
public class Demo {
    public static void main(String[] args) {
        LOL lol = new LOL();
        lol.start();
        lol.update();
    }
}

class Game{
    public void start(){
        System.out.println("游戏启动了");
    }
}

class PCGame extends Game{
    public void update(){
        System.out.println("PC 端更新了");
    }
}

class MobileGame extends Game{
    public void update(){
        System.out.println("手游端更新了");
    }
}

class LOL extends PCGame{

}
