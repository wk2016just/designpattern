package state;

import java.util.Random;

interface State {
   public void insertQuarter();   // 投入25分钱
   public void ejectQuarter();    // 拒绝25分钱
   public void turnCrank();       // 转动曲柄
   public void dispense();        // 发放糖果
}

class NoQuarterState implements State{
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
	// 投入25分钱
	public void insertQuarter() {
		System.out.println("You insert a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
    // 拒绝25分钱
	public void ejectQuarter() {
		System.out.println("You haven't insert a quarter");
	}
    // 转动曲柄
	public void turnCrank() {
		System.out.println("You turned crank,but you there's no quarter");
	}
	// 发放糖果
	public void dispense() {
		System.out.println("You need to pay first");
	}
}


class HasQuarterState implements State {
	Random randomWinner = new Random(System.currentTimeMillis()); 

	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	// 投入25分钱
	public void insertQuarter() {
		System.out.println("You can not insert anther quarter");
	}
	// 拒绝25分钱
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
    // 转动曲柄
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		System.out.println("winner =" + winner);
		if((winner ==0) && (gumballMachine.getCount() > 1)) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}
	// 发放糖果
	public void dispense() {
		System.out.println("No gumball dispensed");
	}
}

class SoldState implements State{
	
	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	// 投入25分钱
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
	// 拒绝25分钱
	public void ejectQuarter() {
		System.out.println("Sorry,you have already turn crank");
	}
	// 转动曲柄
	public void turnCrank() {
		System.out.println("trun twice ,doesn't give you anthor gamball!");
	}
	// 发放糖果
	public void dispense() {
		gumballMachine.releaseBall();
			if(gumballMachine.getCount()>0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
			System.out.println("Opps,out of gamball!");	
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}


class SoldOutState implements State{
	
	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
    // 投入25分钱
	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
	// 拒绝25分钱
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
    // 转动曲柄
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there are no gumballs");
	}
	// 发放糖果
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}
}


class WinnerState implements State{
    GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine){
    	this.gumballMachine = gumballMachine;
    }
    // 投入25分钱
    @Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
    	System.out.println("Please wait, we're already giving you a gumball");
	}
    // 拒绝25分钱
    @Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
    	System.out.println("Sorry,you have already turn crank");
	}
    // 转动曲柄
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("trun twice ,doesn't give you anthor gamball!");
	}
	// 发放糖果
	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You're a Winner! You get two gumballs for your quarter");
		gumballMachine.releaseBall();
	    if(gumballMachine.getCount() == 0) {
	    	gumballMachine.setState(gumballMachine.getSoldOutState());
	    } else {
	    	gumballMachine.releaseBall();//连续两次
	    	if(gumballMachine.getCount()>0){
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
			    System.out.println("Opps,out of gamball!");	
			   gumballMachine.setState(gumballMachine.getSoldOutState());
		   }
	    }
	}
}


class GumballMachine {
	//状态实例
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	// 实例变量state，初始化为糖果售罄状态
	State state = soldOutState; 
	// 记录机器内装有糖果的数目，开始机器是没有装糖果的
	int count=0;
	// 构造器取得糖果的初始数目并把它放在一个实例变量count中
	public GumballMachine(int numberGumballs) {
		// 每种状态都创建一个状态实例
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoldState(this);
		winnerState = new WinnerState(this);
		
		this.count = numberGumballs;
		// 若超过0颗糖果，就将状态设置为NoQuarterState
		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}
	// 取得机器内的糖果数目
	public int getCount() {
		return count;
	}
    // 取得糖果售罄状态
	public State getSoldOutState() {
		return soldOutState;
	}
    // 取得没有25分钱状态
	public State getNoQuarterState() {
		return noQuarterState;
	}
    // 取得拥有25分钱
	public State getHasQuarterState() {
		return hasQuarterState;
	}
    // 取得售出糖果状态
	public State getSoldState() {
		return soldState;
	}
	// 取得赢家状态
	public State getWinnerState() {
		return winnerState;
	}
    // 投入25分钱
	public void insertQuarter(){
		state.insertQuarter();
	}
	// 拒绝25分钱
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	// 转动曲柄
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	// 设置状态
	public void setState(State state){
		this.state=state;
	}
	// 糖果滚出来一个
	public void releaseBall(){
		System.out.println("A gumball comes rolling out of the solt...");
		if(count!=0){
			count--;
		}
	}
}



public class GumballMachineTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        
        System.out.println(gumballMachine);
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");
        
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine); 
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");
        
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine); 
        System.out.println("The current gumball number is:" + gumballMachine.getCount());
        System.out.println("****************************************");
	}

}

