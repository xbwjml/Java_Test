package com.exception.day01;

public class Demo2 {
	public static void main(String[] args) {
		
		//����ʹ��һ�� try ��� catch
		try {
			String s = null;
			System.out.println(s.length());
			
			int[] arr = new int[3];
			System.out.println(arr[5]);
		} catch (NullPointerException e) {
			System.out.println("��ָ���쳣");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("��������Խ���쳣");
		}catch (Exception e) {
			System.out.println("�쳣");
		}
		
		//���catch֮��Ĺ�ϵ��
			//���catch֮��������Ӹ���
			//ƽ��֮��û��˳���ϵ
		    //������Ӹ��࣬�����쳣������ں���
		
	}
}
