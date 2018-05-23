package com.zjm.design.d16_iterator;

public class ListIterator implements ItratorTest{
	private CollectionTest colletions;
	
	private int position = -1;
	
	public  ListIterator(CollectionTest collectionTest) {
		this.colletions = collectionTest;
	}
	
	@Override
	public Object previous() {
		if(position>0) {
			position--;
		}
		return colletions.get(position);
	}

	@Override
	public Object next() {
		if(position<colletions.size()-1) {
			position++;
		}
		return colletions.get(position);
	}

	@Override
	public boolean hasNext() {
		if(position<colletions.size()-1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object first() {
		position = 0;
		return colletions.get(position);
	}

}
