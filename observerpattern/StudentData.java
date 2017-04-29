package observerpattern;

import java.util.ArrayList;

public class StudentData implements Subject {
    ArrayList<Observer> observers;
    private String name;
    private int score;
    
    public StudentData(){
    	observers = new ArrayList<Observer>();
    }
    
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(o);
		}

	}

	@Override
	public void notifyObserver() {
		for(Observer o:observers){
			o.update(name, score);
		}

	}
	
	public void setMeasurements(String name,int score){
		this.name = name;
		this.score = score;
		notifyObserver();
	}

}
