package com.auditionoffer.audition02;
/*只适用于单线程
 * 懒汉模式
 * */
public class Singleton1 {
	private Singleton1() {//私有方法确保只创建一个实例
		// TODO Auto-generated constructor stub
	}

	private static Singleton1 instance = null;

	public static Singleton1 getInstance() {
		if (instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
