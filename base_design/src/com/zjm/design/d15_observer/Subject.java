package com.zjm.design.d15_observer;

public interface Subject {
	void add(Observer observer);
	
	void del(Observer observer);
	
	void notifyObserver();
	
	void opration();
	
	
}
