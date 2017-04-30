package compound;

public class RedheadDuck implements Quackable {

	//将添加、移除、通知观察者的任务委托给辅助类进行处理
	QuackObservable quackObservable;
		
	
	public RedheadDuck() {
		this.quackObservable = new ObservableAssist(this);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println(RedheadDuck.class.getName()+"\t"+"红头鸭,quack");
	   notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		quackObservable.registerObserver(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		quackObservable.removeObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		quackObservable.notifyObservers();
	}

}
