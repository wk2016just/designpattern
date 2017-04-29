package javacallback;


//remember :回调是框架设计的基本手段
//如果站在上层模块的角度（类层次，利用多态子类实现），即me是上层模块，所说的好莱坞法则是对的，它反映了分层结构的依赖单向性。
//如果站在下层模块的角度（分层），即me是下层模块，所说的好莱坞法则是对的，它是框架设计的基本原则。相关术语有：回调、GUI编程
//事件驱动编程、观察者模式、依赖注入、分布式编程（RMI中也经常使用回调机制）、隐式调用、（控制反转）……Java的匿名类，C++的
//函数指针、C#的λ表达式……
public class Wk extends Person{
	public Wk(String name,int a,int b){
		this.setName(name);
		this.setBegin(a);
		this.setEnd(b);
	}

	@Override
	public void say() {
		System.out.println(this.getName() + "say:"+ "a long time~" );
		
	}
	
	public void call(){
		CallBackSuper.callback(this.getBegin(), this.getEnd(), this);
	}
	
	public static void main(String[] args){
		Wk wk = new Wk("wk2016",20,40);
		wk.call();
		WkStudent ws = new WkStudent("wk2008",20,40);
		ws.call();
	}
	

}
