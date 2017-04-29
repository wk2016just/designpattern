package iterator;

import java.util.Iterator;

public class CoffeeIterator implements Iterator {
	MenuItem[] items;
	int count;
	public CoffeeIterator(MenuItem[] items){
		this.items=items;
		count=0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return count<items.length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return items[count++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
