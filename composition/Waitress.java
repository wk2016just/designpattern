package composition;

import java.util.Iterator;

public class Waitress {
	
	MenuComponent menuComponent;

	public Waitress(MenuComponent menuComponent) {
		super();
		this.menuComponent = menuComponent;
	}
	
	public void print(){
		menuComponent.print();
	}
	

	public void printVegetarianName(){
		Iterator iteratorAll=menuComponent.createIterator(); //返回组合迭代器
		while (iteratorAll.hasNext()) {
			MenuComponent currMenuComponent = (MenuComponent) iteratorAll.next(); //组合迭代器的next可能是菜单项，但因为菜单项返回nulliterator
																				  //所以hasNext总是false，所以每次到菜单项则pop然后继续下一个stack的hasNext
			try { 
				//表示是菜单项 并且是素菜
				if(currMenuComponent.isVegetarian()){
					System.out.println(currMenuComponent);
				}
			} catch (Exception e) {
				// TODO: handle exception
				//菜单 会抛出异常
			}
		}
	}
	
}
