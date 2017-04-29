package iterator;

public class MenuItem {

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
	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", price=" + price + ", description="
				+ description + ", vegetarian=" + vegetarian + "]";
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
	public String getDescription() {
		return description;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	
	
}
