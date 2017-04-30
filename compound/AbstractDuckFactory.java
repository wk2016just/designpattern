package compound;

/**
 * 抽象工厂 创建鸭子
 * @author Administrator
 *
 */
public abstract class AbstractDuckFactory {
	
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createBeiJingDuck();
	
	public abstract Quackable createFlockDuck();
}
