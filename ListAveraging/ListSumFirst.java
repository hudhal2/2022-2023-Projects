/**
 * ListSumFirst.java  02/22/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

import java.util.List; //imports List

public class ListSumFirst
{
	public static int go( List<Integer> ray) //static method meaning no need to create object
	{
		int sum = 0; //local var
		for (int i = 1; i < ray.size(); i++) //repeats, starting at 1, for the length of the arrayList
		{
			if (ray.get(i) > ray.get(0)) //if value at i in the arrayList is greater than the first value
			{
				sum += ray.get(i); //adds value at i to the arrayList
			}
		}
		if (sum == 0)
		{
			return -1;
		}
		else
		{
			return sum;
		}
	}
}