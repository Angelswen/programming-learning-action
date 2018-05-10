package com.vechace.Singleton;

/**
 * ����ʽ�������ʱ��ʼ����ͨ��JVM����ػ��Ʊ�֤�̰߳�ȫ��������߳�ͬ������
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
 * ��̬��ʵ�������أ�ͨ��JVM����ػ�������֤�̰߳�ȫ
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





