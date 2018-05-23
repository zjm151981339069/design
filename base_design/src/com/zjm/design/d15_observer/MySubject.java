package com.zjm.design.d15_observer;

public class MySubject extends AbstractSubject{

	@Override
	public void opration() {
		System.out.println("update myself");
		notifyObserver();
	}

}
