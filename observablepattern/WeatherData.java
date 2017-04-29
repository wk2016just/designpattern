package observablepattern;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float pressure;
	
	public WeatherData(){
		
	} //构造器不在需要初始化观察者列表了
	
	public void measurementsChanged(){
		setChanged(); //在之前要调用此方法
		notifyObservers(); //这里没有传送数据给update，说明采用拉的方式
	}
	public void measurementsChanged2(int args){
		setChanged(); //在之前要调用此方法
		notifyObservers(new Integer(args)); //这里没有传送数据给update，说明采用拉的方式
	}
	public void setMeasurements(float temperature,float pressure){
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void setMeasurements2(float temperature,float pressure,int args){
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged2(args);
	}
	
	public float getTemperature() {
		return temperature;
	}


	public float getPressure() {
		return pressure;
	}

	
	

}
