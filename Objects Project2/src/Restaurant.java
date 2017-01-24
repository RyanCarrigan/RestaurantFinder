import java.util.ArrayList;
public class Restaurant
	{
	String name;
	String typeOfFood;
	int waitTime;
	boolean isFastFood;
	int serviceRate;
	int price;
	public Restaurant(String n, String f, int w, boolean ff, int s, int p)
		{
		name = n;
		typeOfFood = f;
		waitTime = w;
		isFastFood = ff;
		serviceRate = s;
		price = p;
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public String getTypeOfFood()
		{
			return typeOfFood;
		}
	public void setTypeOfFood(String typeOfFood)
		{
			this.typeOfFood = typeOfFood;
		}
	public int getWaitTime()
		{
			return waitTime;
		}
	public void setWaitTime(int waitTime)
		{
			this.waitTime = waitTime;
		}
	public int getServiceRate()
		{
			return serviceRate;
		}
	public void setServiceRate(int serviceRate)
		{
			this.serviceRate = serviceRate;
		}
	public int getPrice()
		{
			return price;
		}
	public void setPrice(int price)
		{
			this.price = price;
		}
	public boolean isFastFood()
		{
			return isFastFood;
		}
	public void setFastFood(boolean isFastFood)
		{
			this.isFastFood = isFastFood;
		}	
	
	}
