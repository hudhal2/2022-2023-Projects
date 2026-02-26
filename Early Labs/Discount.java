/**
 * StringRunner.java  10/20/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/
public class Discount
{
	private double amount;

	public Discount()
	{
	}

	public Discount( double a )
	{
	 	amount = a; //sets variables
	}

	public boolean check()
	{
		return false;
	}

	public double getTheBill()
	{
	 	if (amount > 2000) //condition
		{
		 	return amount * .85; //operation on amount
		}
		return amount; //returning
	}
}