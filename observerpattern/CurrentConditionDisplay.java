package observerpattern;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private String name;
	private int score;
	private Subject studentdata;
	
	public CurrentConditionDisplay(Subject studentdata){
		this.studentdata = studentdata;
		studentdata.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("current student:"+name+","+score);

	}

	@Override
	public void update(String name, int score) {
		this.name = name;
		this.score = score;
		display();

	}

}
