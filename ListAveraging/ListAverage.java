/**
 * ListAverage.java  02/24/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

import java.util.List; //imports lists

public class ListAverage
{
	public static double go( List<Integer> ray) //creates static method 'go' with paramter for an Integer arrayList
	{
		int max = -2147483647; //local vars
		int min = 2147483647;
		for (int i = 0; i < ray.size(); i++) //repeats for arraylist length
		{
			if (ray.get(i) > max) //if value 'i' in ray is greater than max
			{
				max = ray.get(i); //sets max to value 'i' in ray
			}
			if (ray.get(i) < min) //if ray 'i' is less than min
			{
				min = ray.get(i); //sets min to ray 'i'
			}
		}
		return (double)(max + min) / 2; //returns the avg of max and min
	}
}