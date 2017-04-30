package compound;

/**
 * 鸭子装饰器  添加计数行为
 */
public class QuackCount implements Quackable {

	private static int count=0;
	Quackable quackable;

	public QuackCount() {
		// TODO Auto-generated constructor stub
	}

	public QuackCount(Quackable quackable) {
		// TODO Auto-generated constructor stub
		this.quackable=quackable;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		quackable.quack();
		System.out.println("第"+(++count)+"次叫");
	}

	public static int getCount() {
		return count;
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		quackable.registerObserver(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		quackable.removeObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		quackable.notifyObservers();
	}
    
	
}
