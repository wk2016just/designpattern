package decoratorpattern;

public class LattleCaffe extends Beverage {

	public LattleCaffe(){
		description = "LattleCaffe"; //description±äÁ¿¼Ì³Ð×ÔBeverage
	}
	@Override
	public double cost() {
		return 2.00;
	}

}
