package first;

public class CurrentConditionDisplay implements Observer, DisplayElement
{
	//目前状况布告板,其他两个差不多。
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay (Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display()
	{
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+temperature+"F degrees and "+ humidity +"% humidity");

	}

	@Override
	public void update(float temperature, float humidity, float pressure)
	{
		// TODO Auto-generated method stub
		this.temperature=temperature;
		this.humidity=humidity;
		display();

	}

}
