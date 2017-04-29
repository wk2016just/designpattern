package iterator;

import java.util.Iterator;
import java.util.List;

public class WaitressList {
	
	List<Menu> menus;
	public WaitressList(List<Menu> menus) {
		super();
		this.menus = menus;
	}

	public void printMenu(){
		System.out.println("==============开始打印菜单==============");
		Iterator<Menu> menusIterator=menus.iterator();
		while(menusIterator.hasNext()){
			Menu menu=menusIterator.next();
			printMenu(menu.createIterator());
		}
		System.out.println("==============结束打印菜单==============");
	}

	private void printMenu(Iterator<MenuItem> iteratorMenu) {
		// TODO Auto-generated method stub
		System.out.println("   ===========开始打印新菜单===========   ");
		for (Iterator iterator = iteratorMenu; iterator.hasNext();) {
			MenuItem miItem = (MenuItem) iterator.next();
			System.out.println(miItem);
		}
		System.out.println("   ===========结束打印新菜单===========   ");
	}
	
	
}
