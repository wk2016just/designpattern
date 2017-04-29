package iterator;


import java.util.ArrayList;
import java.util.List;



public class WaitressTest {


	public void test() {

    Menu panMenu = new PanCakeHouse();
	Menu coffeeMenu = new CoffeeMenu();
	Menu chineseMenu = new ChineseFood();
	Waitress waitress=new Waitress(panMenu, coffeeMenu, chineseMenu);
    
	waitress.printMenu();
		
	System.out.println("\n\n\n\n");
	
	List<Menu> menus=new ArrayList<>();
	menus.add(panMenu);
	menus.add(coffeeMenu);
	menus.add(chineseMenu);
	WaitressList waitressList=new WaitressList(menus);
	waitressList.printMenu();
	
	}

}
