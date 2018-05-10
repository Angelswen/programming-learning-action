package com.vechace.Singleton;

/**
 * 饿汉式：类加载时初始化，通过JVM类加载机制保证线程安全，避免多线程同步问题
 * @author asus-pc
 *
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		return instance;
	}
}

/**
 * 静态类实现懒加载：通过JVM类加载机制来保证线程安全
 * @author asus-pc
 *
 */
class LazyInitSingleton{
	private LazyInitSingleton(){}
	private static class SingletonHolder{
		private static final LazyInitSingleton instance = new LazyInitSingleton();
	}
	
	public LazyInitSingleton getInstance(){
		return SingletonHolder.instance;
	}
}





