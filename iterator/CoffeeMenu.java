package iterator;

import java.util.Iterator;

public class CoffeeMenu implements Menu {

	MenuItem[] items;
	int count=0;
	public CoffeeMenu(){
		items=new MenuItem[5];
		addMenuItem(new MenuItem("拿铁咖啡", 100, "咖啡与牛奶的交融", true));
		addMenuItem(new MenuItem("越南咖啡", 200, "采用纯正的越南咖啡豆", true));
		addMenuItem(new MenuItem("美式咖啡", 80, "清新的风味中不失本香", true));
		addMenuItem(new MenuItem("爱尔兰咖啡", 220, "融入砂糖、爱尔兰酒", true));
		addMenuItem(new MenuItem("皇家咖啡", 280, "流传于宫廷之中", true));
	}
	
	
	private void addMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		items[count++]=menuItem;
	}


	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator(items);
	}

}
