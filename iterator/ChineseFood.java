package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ChineseFood implements Menu {

	Map<String, MenuItem> items=new HashMap<>();
	
	public ChineseFood(){
		addMenuItem(new MenuItem("宫保鸡", 45, "宫保鸡丁是川菜的代表菜，由鸡脯肉、干辣椒、花生米炒制而成，香辣好吃", false));
		addMenuItem(new MenuItem("糖醋里脊", 78, "糖醋里脊色泽红亮、酸甜可口、外酥里嫩", false));
		addMenuItem(new MenuItem("烤鸭", 80, "北京烤鸭，被誉为“天下美味”而驰名中外，它更以色泽红润，肉质细嫩，味道醇厚，肥而不腻的特色而享誉海内外", false));
	}
	
	
	private void addMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		items.put(menuItem.getName(), menuItem);
	}


	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return items.values().iterator();
	}

}
