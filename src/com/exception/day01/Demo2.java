package com.exception.day01;

public class Demo2 {
	public static void main(String[] args) {
		
		//可以使用一个 try 多个 catch
		try {
			String s = null;
			System.out.println(s.length());
			
			int[] arr = new int[3];
			System.out.println(arr[5]);
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组索引越界异常");
		}catch (Exception e) {
			System.out.println("异常");
		}
		
		//多个catch之间的关系：
			//多个catch之间可以有子父类
			//平级之间没有顺序关系
		    //如果有子父类，父类异常必须放在后面
		
	}
}
