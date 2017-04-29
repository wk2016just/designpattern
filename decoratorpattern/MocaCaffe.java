package decoratorpattern;

public class MocaCaffe extends Beverage {

	public MocaCaffe(){
		description = "MocaCaffe";
	}
	
	
	@Override
	public double cost() {
		return 1.90;
	}

}
