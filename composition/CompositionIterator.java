package composition;

import java.util.Iterator;
import java.util.Stack;


public class CompositionIterator implements Iterator {

	//使用堆栈 迭代树形结构
	Stack stack=new Stack<>();
	
	public CompositionIterator(Iterator iterator) {
		// TODO Auto-generated constructor stub
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		//判断堆栈是否为空
		if(stack.empty()){
			return false;
		}else {
			Iterator iterator=(Iterator) stack.peek();
			//判断迭代器是否遍历到最后元素
			if(!iterator.hasNext()){
				stack.pop();
				return hasNext();
			}else {
				return true;
			}
		}
		
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()){
			Iterator iterator=(Iterator) stack.peek();
			MenuComponent menuComponent=(MenuComponent) iterator.next();
			//如果是菜单的话 入栈 遍历 菜单中的菜单项
			if(menuComponent instanceof Menu)
			{
				stack.push(menuComponent.createIterator());
			}
			return menuComponent;
		}else {
			return null;
		}
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
