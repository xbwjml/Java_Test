package com.IOSenior.day01;

public class Demo1 {
	public static void main(String[] args) {
/**
 * File类创建和删除功能
 *  boolean createNewFile():指定路径不存在该文件时时创建文件,返回true,否则返回false
 *  boolean mkdir():当指定的单级文件夹不存在时创建文件夹并返回true，否则返回false  
 *	boolean mkdirs():当指定的多级文件夹某一级文件夹不存在时,创建多级文件夹并返回true,否则返回false
 *	boolean delete():删除文件或者删除单级文件夹
 */

/**
 * File类的判断功能
 *	boolean exists():判断指定路径的文件或文件夹是否存在
 *	boolean isAbsolute():判断当前路路径是否是绝对路径
 *	boolean isDirectory():判断当前的目录是否存在
 *	boolean isFile():判断当前路径是否是一个文件
 *	boolean isHidden():判断当前路径是否是隐藏文件
 */

/**
 * File类的获取功能和修改名字功能
 *	  File getAbsoluteFile():获取文件的绝对路径,返回File对象
 *	  String getAbsolutePath():获取文件的绝对路径,返回路径的字符串
 *	  String getParent():获取当前路径的父级路径,以字符串形式返回该父级路径
 *	  File getParentFile():获取当前路径的父级路径,以字File对象形式返回该父级路径
 *	  String getName():获取文件或文件夹的名称
 *	  String getPath():获取File对象中封装的路径
 *	  long lastModified():以毫秒值返回最后修改时间
 *	  long length():返回文件的字节数
 *	  boolean renameTo(File dest): 将当前File对象所指向的路径 修改为 指定File所指向的路径
 */
		
/**
 * File类的其它获取功能
 *	String[] list():以字符串数组的形式返回当前路径下所有的文件和文件夹的名称
 *	File[] listFiles():以File对象的形式返回当前路径下所有的文件和文件夹的名称
 *	static File[] listRoots():获取计算机中所有的盘符
 */
	}
}
