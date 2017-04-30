package compound;

/**
 * 使用装饰器创建鸭子
 *
 */
public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new QuackCount(new MallardDuck());
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new QuackCount(new RedheadDuck());
	}

	@Override
	public Quackable createBeiJingDuck() {
		// TODO Auto-generated method stub
		return new QuackCount(new BeiJingDuck());
	}

	@Override
	public Quackable createFlockDuck() {
		// TODO Auto-generated method stub
		return null;
	}

}
