package decoratorpattern;

public class Order {

	public static void main(String[] args) {
		Beverage beverage = new MocaCaffe();
		System.out.println(beverage.getDescription() + "cost:" + beverage.cost());
		
		Beverage beverage2 = new LattleCaffe();
		beverage2 = new Milk(beverage2);
		beverage2 = new Milk(beverage2);
		beverage2 = new Soy(beverage2);
		System.out.println(beverage2.getDescription() + "cost:" + beverage2.cost());
	}
}
