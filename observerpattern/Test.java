package observerpattern;

public class Test {

	public static void main(String[] args) {
		StudentData sd = new StudentData();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(sd);
		
		sd.setMeasurements("wk", 60);
	}
}
