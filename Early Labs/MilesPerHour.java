/**
 * MilesPerHour.java  9/31/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class MilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
		return (double)dist / (hrs + (double)mins / 60); //Calculates MPH
	}
}

