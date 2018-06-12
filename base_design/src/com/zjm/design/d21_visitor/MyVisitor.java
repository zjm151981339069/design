package com.zjm.design.d21_visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Subject sub) {
		System.out.println(sub.getSubject());
	}

}
