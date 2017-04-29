package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PanCakeHouse implements Menu {

	List<MenuItem> items=new ArrayList<MenuItem>();
	
	public PanCakeHouse(){
		addMenuItem(new MenuItem("热干面", 10, "地道的武汉热干面", true));
		addMenuItem(new MenuItem("过桥米线", 8, "正宗的云南过桥米线", true));
		addMenuItem(new MenuItem("鸡蛋肠粉", 80, "广州的地道早餐", false));
	}
	
	private void addMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		items.add(menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return items.iterator();
	}

}
