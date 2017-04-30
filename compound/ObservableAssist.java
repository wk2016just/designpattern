package compound;

import java.util.ArrayList;
import java.util.List;


public class ObservableAssist implements QuackObservable {

	List<Observer> listObservers=new ArrayList<>();
	QuackObservable quackObservable;

	public ObservableAssist(QuackObservable quackObservable) {
	
		this.quackObservable=quackObservable;
	}

	public void registerObserver(Observer observer) {
		listObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		if (listObservers.contains(observer)) {
			listObservers.remove(observer);
		}
	}


	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : listObservers) {
			//通知观察者
			observer.update(quackObservable);
		}
	}

}
