package com.zjm.design.d16_iterator;

public class ListCollection implements CollectionTest {
	public String string[] = {"A","B","C","D","E"};  
	
	@Override
	public ItratorTest iterator() {
		return new ListIterator(this);
	}

	@Override
	public Object get(int i) {
		return string[i];
	}

	@Override
	public int size() {
		return string.length;
	}

}
