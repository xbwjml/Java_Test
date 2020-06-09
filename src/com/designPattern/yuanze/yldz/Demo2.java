package com.designPattern.yuanze.yldz;

public class Demo2 {
	public static void main(String[] args) {
	}
}



//方式一:通过接口传递实现依赖
//开关的接口
//interface IOpenAndClose{
//	public void open(ITv itv);
//}
//
//interface ITv{
//	public void play();
//}
//
////实现接口
//class Impl implements IOpenAndClose{
//	@Override
//	public void open(ITv itv) {
//		itv.play();
//	}
//}

//方式二：通过构造方法传递依赖
//interface IOpenAndClose{
//	public void open();
//}
//
//interface ITv {
//	public void play();
//}
//
//class Impl implements IOpenAndClose{
//	public ITv iTv;//成员
//	public Impl(ITv iTv) {//构造器
//		this.iTv = iTv;
//	}
//	@Override
//	public void open() {
//		this.iTv.play();
//	}
//}

//方式三:通过setter方法传递
//interface IOpenAndClose{
//	public void setTv(ITv itv);
//	public void open();
//}
//
//interface ITv {
//	public void play();
//}
//
//class Impl implements IOpenAndClose{
//	private ITv iTv;
//
//	@Override
//	public void setTv(ITv tv) {
//		this.iTv = tv;
//	}
//	
//	@Override
//	public void open() {
//		this.iTv.play();
//	}
//}