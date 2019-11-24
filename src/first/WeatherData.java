package first;
import java.util.*;

//主题Suject的具体实现
public class WeatherData implements Subject
{
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>0)
			observers.remove(i);
	}
	
	public void notifyObserver() {
		for (int i = 0;i<observers.size();i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	public void measurementsChanged() {
		notifyObserver();
	}
	public void setMeasurements(float temperature ,float humidity , float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

}