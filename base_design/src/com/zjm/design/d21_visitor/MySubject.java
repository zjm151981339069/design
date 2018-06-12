package com.zjm.design.d21_visitor;

public class MySubject implements Subject{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}

	@Override
	public String getSubject() {
		return "love";
	}

}
