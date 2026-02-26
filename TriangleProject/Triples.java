/**
 * Triples.java  12/13/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class Triples
{
 	private int number; //creates instance variable

	public Triples(int num)
	{
		number = num; //sets variable to parameter 'num'
	}

	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 0; //creates a variable to keep track of gcd
		for (int i = 1; i <= a || i <= b || i <= c; i++) //loops until it meets the smallest of a, b, or c
		{
			if (a % i == 0 && b % i == 0 && c % i == 0) //if abc divided by 'i' has no remainder (factor)
			{
				gcd = i; //sets gcd to 'i'
			}
		}
		return gcd; //returns gcd
	}

	public String toString()
	{
		for (int a = 1; a <= number; a++)
		{
    		for (int b = 1; b <= number; b++) //nested loops of abc that go until they are equal to the variable 'number'
			{
      			for (int c = 1; c <= number; c++)
				{
      				if (a * a + b * b == c * c) //pythagorean formula
					{
					 	if ((a % 2 == 0 && b % 2 != 0 && c % 2 != 0) || (a % 2 != 0 && b % 2 == 0 && c % 2 != 0)) //makes sure a and b are opposite signs and c is always odd
						{
							if (greatestCommonFactor(a, b, c) <= 1) //uses method to find the gcd of abc
							{
								if (a < b && b < c) //makes sure a is bigger than b and b is bigger than c
								{
									System.out.println(a + " " + b + " " + c); //if all requirements are met, prints abc
								}
							}
						}
        			}
      			}
    		}
   		}
		String output = "";
		return output + "\n";
	}
}