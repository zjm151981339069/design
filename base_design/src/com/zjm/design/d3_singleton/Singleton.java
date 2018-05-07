package com.zjm.design.d3_singleton;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
	}

	// 线程不安全
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 线程安全，但是每一次访问都有进行对象加锁
	public static synchronized Singleton getInstance1() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	// 表面上是第一次实例化加锁，实际不是，
	public static Singleton getInstance2() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
