package first;

//这是主题接口，相当于报纸出版社
public interface Subject
{
	//这个用来添加观察者，相当于注册报刊会员
	public void registerObserver(Observer o);
	//这个用来删除观察者，相当于注销报刊会员
	public void removeObserver(Observer o);
	//当主题状态改时，这个方法会被调用，以通知所有的观察者
	public void notifyObserver();

}
