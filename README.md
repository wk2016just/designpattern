# designpattern
headfirst gof代码，组合模式将观察者装入工厂模式以及递归的notify时，稍微复杂一些
辅助类ObservableAssist：
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : listObservers) {
			//通知观察者
			observer.update(quackObservable);
		}
	}
鸭群FlockDuck由内部迭代器：
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		//递归迭代 内部迭代器
		for (Iterator iterator = flockQuackables.iterator(); iterator.hasNext();) {
			Quackable quackable = (Quackable) iterator.next();
			quackable.quack();
			
		}
	}
  
 
