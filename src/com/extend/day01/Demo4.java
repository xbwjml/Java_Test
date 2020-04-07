package com.extend.day01;

/**
 * @author LeeMJ
 * @Date 2020 - 04 - 07 - 16:22
 */
public class Demo4 {
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.call();
    }
}

class Phone{
    public void call(){
        System.out.println("打电话");
    }
}

class NewPhone extends Phone{
    @Override
    public void call(){
        System.out.println("录音");
        super.call();
    }
}
