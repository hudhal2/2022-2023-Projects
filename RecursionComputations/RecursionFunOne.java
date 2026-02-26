/**
 * RecursionFunOne.java  04/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class RecursionFunOne
{
	public static int countEvenDigits(int num) //static method, returns int
	{
		if ( num > 0 ) //if paramter is greater than 0
		{
			if ((num % 10) % 2 == 0) //if the remainder is even
			{
				num = num / 10; //removes bottom digit
				return 1 + countEvenDigits(num); //returns 1 + the method with the new, smaller num
			}
			num = num / 10; //otherwise removes digit
			return 0 + countEvenDigits(num); //and calls the method again
		}
		return 0;
	}
}