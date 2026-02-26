/**
 * Distance.java  10/06/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class Distance
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		return Math.sqrt(Math.pow((xTwo - xOne), 2) + Math.pow((yTwo - yOne), 2));	
	}
}