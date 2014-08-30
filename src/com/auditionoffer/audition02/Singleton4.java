package com.auditionoffer.audition02;
/*所谓“双重检查加锁”机制，指的是：并不是每次进入getInstance方法都需要同步，
 * 而是先不同步，进入方法后，先检查实例是否存在，如果不存在才进行下面的同步块，
 * 这是第一重检查，进入同步块过后，再次检查实例是否存在，如果不存在，
 * 就在同步的情况下创建一个实例，这是第二重检查。这样一来，就只需要同步一次了，
 * 从而减少了多次在同步情况下进行判断所浪费的时间。
 * */
public class Singleton4 {
	private Singleton4() {//私有方法确保只创建一个实例
		// TODO Auto-generated constructor stub
	}

	private volatile  static Singleton4 instance = null;

	public synchronized  static Singleton4 getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton4.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
		return instance;
	}
}
