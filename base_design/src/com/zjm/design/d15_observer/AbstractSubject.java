package com.zjm.design.d15_observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	private Vector<Observer> vector = new Vector<Observer>();

	@Override
	public void add(Observer observer) {
		vector.add(observer);
	}
	
	@Override
	public void del(Observer observer) {
		vector.remove(observer);
	}
	
	public void notifyObserver() {
		Enumeration<Observer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			Observer observer = (Observer) elements.nextElement();
			observer.update();
		}
	}
}
