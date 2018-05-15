package com.zjm.design.d5_prototype;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Prototype prototype = new Prototype();
		Object deepClone = prototype.deepClone();
	}
}
