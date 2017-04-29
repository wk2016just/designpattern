package iterator;

import java.util.Iterator;


public class Waitress {
	
	Menu panMenu;
	Menu coffeeMenu;
	Menu chineseMenu;
	public Waitress(Menu panMenu, Menu coffeeMenu, Menu chineseMenu) {
		super();
		this.panMenu = panMenu;
		this.coffeeMenu = coffeeMenu;
		this.chineseMenu = chineseMenu;
	}
	
	public void printMenu(){
		System.out.println("==============开始打印菜单==============");
		System.out.println("   ===========开始打印咖啡菜单===========   ");
		Iterator<MenuItem> iteratorMenu=coffeeMenu.createIterator();
		printMenu(iteratorMenu);
		System.out.println("   ===========结束打印咖啡菜单===========   ");
		System.out.println("   ===========开始打印中国菜菜单===========   ");
		iteratorMenu=chineseMenu.createIterator();
		printMenu(iteratorMenu);
		System.out.println("   ===========结束打印中国菜菜单===========   ");
		System.out.println("   ===========开始打印煎饼屋菜单===========   ");
		iteratorMenu=panMenu.createIterator();
		printMenu(iteratorMenu);
		System.out.println("   ===========结束打印煎饼屋菜单===========   ");
		System.out.println("==============结束打印菜单==============");
	}

	private void printMenu(Iterator<MenuItem> iteratorMenu) {
		// TODO Auto-generated method stub
		for (Iterator iterator = iteratorMenu; iterator.hasNext();) {
			MenuItem miItem = (MenuItem) iterator.next();
			System.out.println(miItem);
		}
	}
	
	
}
