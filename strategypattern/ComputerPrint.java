package strategypattern;

public class ComputerPrint implements Print {

	@Override
	public void print() {
		System.out.println("Computer on");
		System.out.println("ComputerPrint");

	}

}
