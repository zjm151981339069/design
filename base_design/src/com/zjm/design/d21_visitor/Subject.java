package com.zjm.design.d21_visitor;

public interface Subject {
	public void accept(Visitor visitor);
	public String getSubject();
}
