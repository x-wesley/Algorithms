package com.auditionoffer.audition02;

/*一种可行的方式就是采用类级内部类，在这个类级内部类里面去创建对象实例。
 * 这样一来，只要不使用到这个类级内部类，那就不会创建对象实例，
 * 从而同时实现延迟加载和线程安全。
 * */
public class Singleton5 {
	private Singleton5() {//私有方法确保只创建一个实例
		// TODO Auto-generated constructor stub
	}

	/**
	 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
	 */
	private static class SingletonHolder {
		/**
		 * 静态初始化器，由JVM来保证线程安全
		 */
		private static Singleton5 instance = new Singleton5();
	}

	public static Singleton5 getInstance() {
		return SingletonHolder.instance;
	}
}
