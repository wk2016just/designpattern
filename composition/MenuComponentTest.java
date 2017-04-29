package composition;




public class MenuComponentTest {


	public void test() {
		//构建菜单树
		MenuComponent coffeeMenuComponent=new Menu("咖啡菜单", "各种口味的咖啡");
		MenuComponent dessert=new Menu("甜点菜单", "喝咖啡的时候，还可以来点甜点");
		MenuComponent beverage=new Menu("饮料菜单", "品尝甜点的时候，再来点饮料");
		beverage.add(new MenuItem("柠檬雪碧", 22, "加冰，口感更好", true));
		dessert.add(new MenuItem("酸奶蜂蜜冰淇淋", 57, "口感新颖独特，视觉效果也是一流", true));
		dessert.add(new MenuItem("小粉猪奶黄包", 37, "憨态可掬的小粉猪奶黄包", true));
		dessert.add(beverage);
		coffeeMenuComponent.add(dessert);
		coffeeMenuComponent.add(new MenuItem("拿铁咖啡", 100, "咖啡与牛奶的交融", true));
		coffeeMenuComponent.add(new MenuItem("越南咖啡", 200, "采用纯正的越南咖啡豆", true));
		coffeeMenuComponent.add(new MenuItem("美式咖啡", 80, "清新的风味中不失本香", true));
		
		MenuComponent chineseMenuComponent=new Menu("中国菜菜单", "美味的中国菜");
		chineseMenuComponent.add(new MenuItem("宫保鸡", 45, "宫保鸡丁是川菜的代表菜，由鸡脯肉、干辣椒、花生米炒制而成，香辣好吃", false));
		chineseMenuComponent.add(new MenuItem("糖醋里脊", 78, "糖醋里脊色泽红亮、酸甜可口、外酥里嫩", false));
		chineseMenuComponent.add(new MenuItem("烤鸭", 80, "北京烤鸭，被誉为“天下美味”而驰名中外，它更以色泽红润，肉质细嫩，味道醇厚，肥而不腻的特色而享誉海内外", false));
		
		MenuComponent allmenus=new Menu("根菜单", "所有菜单的入口");
		allmenus.add(coffeeMenuComponent);
		allmenus.add(chineseMenuComponent);
		
		Waitress waitress=new Waitress(allmenus);
		waitress.print();
		System.out.println("\n\n\n");
		System.out.println("==========================打印素食====================================");
		waitress.printVegetarianName();
		
	}

}
