
public class RandomOddEven {
	private int dice;
	private int randomNumber;
	
	//building class constructor to instantiate odd even number
	public RandomOddEven()
	{
		dice = (int)(Math.random()*6+1);
		randomNumber = (int)(Math.random()*10);
	}
	
	public int GetDice()
	{
		return dice;
	}
	
	public int GetRandomNumber()
	{
		return randomNumber;
	}

}
