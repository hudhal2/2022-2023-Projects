/**
 * CoolNumbers.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class CoolNumbers
{
	public static boolean isCoolNumber( int num ) //parameter number
	{
	 	if ( num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1 ) //returns true if the number has a remainder of 1 when divided by 3,4,5,6
		{
		 	return true;
		}
		return false; //otherwise returns false
	}

	public static int countCoolNumbers( int stop )
	{
	 	int count = 0; //sets count to 0
	 	for ( int i = 7; i <= stop; i += 1 ) //starts at 7 and adds 1 to the index until the stop variable is reached
		{
		 	if (isCoolNumber( i ))
			{
			 	count += 1; //adds 1 to count if it's a coolNumber
			}
		}
		return count; //returns the value of count
	}
}