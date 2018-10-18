package com.designpatterns.singleton;

public class SingletonPattern_Thread_Safe {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton3 obj1 = Singleton3.getInstance();
				System.out.println(obj1);
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton3 obj2 = Singleton3.getInstance();
				System.out.println(obj2);
			}
		});
		thread1.start();
		thread2.start();

	}

}

class Singleton3 {
	private static Singleton3 singleInstance;

	private Singleton3() {
		// do nothing
	}

//	public static synchronized Singleton3 getInstance() {
//		if (singleInstance == null) {
//			singleInstance = new Singleton3();
//		}
//		return singleInstance;
//	}
	
	public static Singleton3 getInstance() {
		if (singleInstance == null) {
			singleInstance = new Singleton3();
		}
		return singleInstance;
	}
}

