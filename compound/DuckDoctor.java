package compound;

/**
 * 观察鸭子的叫行为
 *
 */
public class DuckDoctor implements Observer {

	/**
	 * 
	 */
	public DuckDoctor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(QuackObservable quackObservable) {
		// TODO Auto-generated method stub
		System.out.println(DuckDoctor.class.getName()+"\t观察到的鸭子的对象为："+quackObservable);
	}

}
