package com.designpatterns.singleton;

public class SingletonPattern_Lazy_Initalization {

	public static void main(String[] args) {
		Singleton2 obj1 = Singleton2.getInstance();
		System.out.println(obj1);
		Singleton2 obj2 = Singleton2.getInstance();
		System.out.println(obj2);
	}

}

//Issue with the code is if two thread is accessing the getInstance method it will create two instance which is 
// eventually breaks the rule of singleton 

class Singleton2 {
	private static Singleton2 singleInstance;
	private Singleton2 () {
		//do nothing
	}
	public static Singleton2 getInstance () {
		if (singleInstance == null) {
			singleInstance = new Singleton2();
		}
		return singleInstance;
	}
}
