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

import java.util.ArrayList; //imports

public class NumberAnalyzer
{
	private ArrayList<Number> list; //instance var

	public NumberAnalyzer() //instantiates
	{
		list = new ArrayList<Number>();
	}

	public NumberAnalyzer(int[] ray) //instantiates
	{
		list = new ArrayList<Number>();
		for (int i = 0; i < ray.length; i++) //repeats for length of array
		{
			list.add(new Number(ray[i])); //adds 'Number' class with parameter from array to the arrayList
		}
	}

	public int countOdds() //int method
	{
		int count = 0; //local var
		for (int i = 0; i < list.size(); i++) //repeats for length of arrayList
		{
			if (list.get(i).isOdd()) //calls Number method
			{
				count++;
			}
		}
		return count;
	}

	public int countEvens() //int method
	{
		int count = 0; //local var
		for (int i = 0; i < list.size(); i++) //repeats for length of arrayList
		{
			if (!list.get(i).isOdd()) //if method is false
			{
				count++;
			}
		}
		return count;
	}

	public int countPerfects() //int method
	{
		int count = 0; //local var
		for (int i = 0; i < list.size(); i++) //repeats for length of arrayList
		{
			if (list.get(i).isPerfect()) //if method is true
			{
				count++;
			}
		}
		return count;
	}

	public String toString() //toString method
	{
		return "" + list;
	}
}