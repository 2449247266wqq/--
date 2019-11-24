package first;

public interface Observer
{
	//当气象观测值改变时，主题会把这些状态值当作参数传递给观察者。
	public void update(float temperature ,float humidity , float pressure);

}
