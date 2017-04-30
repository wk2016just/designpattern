package compound;


public class DuckTest {

	public void test() {
		System.out.println("=====================测试抽象工厂====================");
		AbstractDuckFactory duckFactory = new DuckFactory();
		// 绿头鸭
		Quackable quackable = duckFactory.createMallardDuck();
		quack(quackable);
		// 红头鸭
		quackable = duckFactory.createRedheadDuck();
		quack(quackable);
		// 北京鸭
		quackable = duckFactory.createBeiJingDuck();
		quack(quackable);
		System.out.println("=====================测试抽象工厂====================");
		System.out.println("=====================测试适配器====================");
		// 将鹅转换为鸭子
		Creak creak = new Goose();
		quack(new GooseAdapter(creak));
		System.out.println("=====================测试适配器====================");
		System.out.println("=====================测试装饰器====================");
		// 为鸭子添加叫声的计数行为
		duckFactory = new CountingDuckFactory();
		// 北京鸭
		quackable = duckFactory.createBeiJingDuck();
		quack(quackable);
		// 绿头鸭
		quackable = duckFactory.createMallardDuck();
		quack(quackable);
		// 红头鸭
		quackable = duckFactory.createRedheadDuck();
		quack(quackable);
		System.out.println("=====================测试装饰器====================");
		System.out.println("=====================测试组合模式====================");
		duckFactory = new DuckFactory();
		//创建鸭子组合
		FlockDuck flockQuackable=(FlockDuck) duckFactory.createFlockDuck();
 		// 绿头鸭
		quackable = duckFactory.createMallardDuck();
		flockQuackable.add(quackable);
		// 红头鸭
		quackable = duckFactory.createRedheadDuck();
		flockQuackable.add(quackable);
		// 北京鸭
		quackable = duckFactory.createBeiJingDuck();
		flockQuackable.add(quackable);
		flockQuackable.quack();
		System.out.println("=====================测试组合模式====================");
		System.out.println("=====================测试观察者模式====================");
		//可观察者
		quackable=duckFactory.createMallardDuck();
		//观察者 
		Observer observer=new DuckDoctor();
		quackable.registerObserver(observer);
		quackable.quack();
		//群组观察
		flockQuackable.registerObserver(observer);
		flockQuackable.quack();
		System.out.println("=====================测试观察者模式====================");

	}

	private void quack(Quackable quackable) {
		// TODO Auto-generated method stub
		quackable.quack();
	}

}
