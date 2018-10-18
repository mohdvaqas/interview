package com.designpatterns.singleton;

public class SingletonPattern_Eager_Initialization {

	public static void main(String[] args) {
		Singleton1 newObj = Singleton1.getInstance();
		System.out.println(newObj);
		Singleton1 newObj1 = Singleton1.getInstance();
		System.out.println(newObj1);
	}

}

class Singleton1 {
	private static Singleton1 obj = new Singleton1();
	private Singleton1() {
		//do nothing
	}
	public static Singleton1 getInstance() {
		return obj;
	}
}
