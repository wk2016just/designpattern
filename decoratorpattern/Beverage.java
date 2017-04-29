package decoratorpattern;

public abstract class Beverage {

	String description = "Common Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
