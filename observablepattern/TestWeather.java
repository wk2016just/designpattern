package observablepattern;

public class TestWeather {

	public static void main(String[] args){
		WeatherData wd = new WeatherData();
		NowConditionsDisplay ncd = new NowConditionsDisplay(wd);
		
		wd.setMeasurements(10,10);
		wd.setMeasurements2(20,20,10);
	}
}
