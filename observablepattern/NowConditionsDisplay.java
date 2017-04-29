package observablepattern;

import java.util.Observable;
import java.util.Observer;

public class NowConditionsDisplay implements Observer{
	Observable o;
	private float temperature;
	private float pressure;

	public NowConditionsDisplay(Observable o){
		this.o = o;
		o.addObserver(this); //自动注册
	}
	
	public void update(Observable obs,Object args){ //由于发布者调用的是第一个版本所以args为空
		if(obs instanceof WeatherData){  
			WeatherData wd = (WeatherData)obs; //首先要实例化观察者，这里其实就是域o
			this.temperature = wd.getTemperature();
			this.pressure = wd.getPressure();
			display();
			if(args != null){
				System.out.println("args-"+(Integer)args);
			}
		}
	}
	
	public void display(){
		System.out.println("current conditions:temperature-"+this.temperature+"----pressure-"+this.pressure);
	}
}
