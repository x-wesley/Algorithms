package com.auditionoffer.audition02;
/*只适用于单线程
 * 饿汉模式
 * */
public class Singleton2 {
	private Singleton2() {//私有方法确保只创建一个实例
		// TODO Auto-generated constructor stub
	}

	private static Singleton2 instance = new Singleton2();

	public static Singleton2 getInstance() {
		return instance;
	}
}
