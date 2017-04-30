package compound;


public class MallardDuck implements Quackable {

	// 将添加、移除、通知观察者的任务委托给辅助类进行处理
	QuackObservable quackObservable;

	public MallardDuck() {
		this.quackObservable = new ObservableAssist(this);
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println(MallardDuck.class.getName() + "\t" + "绿头鸭,quack");
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
		quackObservable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		quackObservable.notifyObservers();
	}

}
