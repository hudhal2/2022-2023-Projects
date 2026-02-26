/**
 * TotalRow.java  03/24/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

import java.util.ArrayList; //imports arraylist
public class TotalRow //class
{
    public static ArrayList<Integer> getRowTotals( int[][] m ) //static method with arrayList return type
    {
    	ArrayList<Integer> ray; //local arrayList
    	ray = new ArrayList<Integer>(); //instantiation of ArrayList class
    	int sum = 0; //local var
    	for (int i = 0; i < m.length; i++) //repeats for num of rows
    	{
    		sum = 0; //sets sum to 0
    		for (int b = 0; b < m[i].length; b++) //repeats for num of columns
    		{
    			sum += m[i][b]; //adds the value to sum
    		}
    		ray.add(sum); //outputs sum values in the row
    	}
		return ray;
    }

	public String toString() //String method
	{
		return "";
	}
}
