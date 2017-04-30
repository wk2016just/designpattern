package compound;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FlockDuck implements Quackable {

	List<Quackable> flockQuackables=new ArrayList<>();

	public FlockDuck() {
		// TODO Auto-generated constructor stub
		
	}

	public void add(Quackable quackable){
		flockQuackables.add(quackable); //可以添加组合用于递归
	}
	

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		//递归迭代 内部迭代器
		for (Iterator iterator = flockQuackables.iterator(); iterator.hasNext();) {
			Quackable quackable = (Quackable) iterator.next();
			quackable.quack();
			
		}
	}

	/**
	 * 向一个组群添加注册时 是向每一个元素添加注册
	 * 
	 * 
	 * 
	 * */
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		for (Quackable quackable : flockQuackables) {
			quackable.registerObserver(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		for (Quackable quackable : flockQuackables) {
			quackable.removeObserver(observer);
		}
	}

	/**
	 * 委托给每一个叶子节点处理通知事件，在quack中实现通知
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
