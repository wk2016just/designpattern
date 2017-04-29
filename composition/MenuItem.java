package composition;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	String name;
	float price;
	String description;
	boolean vegetarian;
	public MenuItem(String name, float price, String description,
			boolean vegetarian) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.vegetarian = vegetarian;
	}
	public MenuItem(String name, String description,
			boolean vegetarian, double price) {
		super();
		this.name = name;
		this.price = (float) price;
		this.description = description;
		this.vegetarian = vegetarian;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return vegetarian;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + ", description="
				+ description + ", vegetarian=" + vegetarian + "]";
	}
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NullIterator();
	}
	
	
	
}
