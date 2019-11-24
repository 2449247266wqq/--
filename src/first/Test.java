package first;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisply = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);

	}

}
