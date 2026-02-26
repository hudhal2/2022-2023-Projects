/**
 * ExpressionSolverRunner.java 03/06/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class Number //class
{
	private int num; //instance variable

	public Number() //base constructor
	{
		num = 0;
	}

	public Number(int n) //constructor with paramter
	{
		num = n; //sets instance var to paramter
	}

	public boolean isOdd() //boolean method
	{
		if (num % 2 != 0) //if even
		{
			return true;
		}
		return false;
	}

	public boolean isPerfect()
	{
		int sum = 0; //local var
		for (int i = 1; i < num; i++) //repeats from 1 to instance var amt
		{
			if (num % i == 0) //if evenly divisible
			{
				sum += i; //adds 1 to local var
			}
		}
		if (num == sum) //if the sum is equal to the instance var
		{
			return true;
		}
		return false;
	}
	public String toString() //toString
	{
		return "" + num;
	}
}

