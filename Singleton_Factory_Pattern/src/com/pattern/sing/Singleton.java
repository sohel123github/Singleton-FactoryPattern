package com.pattern.sing;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		super();
	}

	private static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
