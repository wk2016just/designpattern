package decoratorpattern;

public abstract class CondimentDecorator extends Beverage{

	public abstract String getDescription();//所有子类必须重新实现getDescription,因为超类的这个方法是共同方法用来继承，但是在
											//调料类中变成了委托方法所以需要再次声明为抽象
}
