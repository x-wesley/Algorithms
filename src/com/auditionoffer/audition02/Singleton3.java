package com.auditionoffer.audition02;
/*线程安全
 * synchronized修饰的同步块可是要比一般的代码段慢上几倍的！
 * 如果存在很多次getInstance()的调用，那性能问题就不得不考虑了！
 * */
public class Singleton3 {
	private static Singleton3 instance = null;
	private Singleton3() {//私有方法确保只创建一个实例
		// TODO Auto-generated constructor stub
	}

	

	public synchronized static Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}
