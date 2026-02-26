/**
 * OddOrEven.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class OddOrEven
{
	private int number; //instance variable

	public OddOrEven()
	{
		number = 0; //constructor sets base value
	}

	public OddOrEven(int num)
	{
		number = num; //constructor sets instance var to parameter int
	}

	public void setNum(int num)
	{
		number = num; //sets variable int to num
	}

	public boolean isOdd( )
	{
		if ( number % 2 != 0) //if the number divided by 2 isn't 0 return true
		{
			return true;
		}
		return false;
	}

	public String toString()
	{
		if (isOdd()) //calls isOdd method
		{
			return number + " is odd.\n\n"; //returns false if num is odd
		}
		return number + " is even.\n\n"; //otherwise returns true
	}
}