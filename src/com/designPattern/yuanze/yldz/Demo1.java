package com.designPattern.yuanze.yldz;

public class Demo1 {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
		person.receive(new Weixin());
		person.receive(new QQ());
	}
}

//完成Person接收消息的功能
class Person{
	public void receive(IReceiver i) {
		System.out.println(i.getInfo());
	}
}

interface IReceiver{
	public String getInfo();
}

class Email implements IReceiver{
	@Override
	public String getInfo() {
		return "电子邮件内容：Hello World";
	}
}
class Weixin implements IReceiver{
	@Override
	public String getInfo() {
		return "微信内容：Hello World";
	}
}
class QQ implements IReceiver{
	@Override
	public String getInfo() {
		return "QQ内容：Hello World";
	}
}