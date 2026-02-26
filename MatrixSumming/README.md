/**
 * TotalRowRunner.java  03/24/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class MatrixCount1
{
    private static int[][] m = {{1, 2, 3, 4, 5}, //static instance var matrix
    	{6, 7, 8, 9, 0},
    	{6, 7, 1, 2, 5},
    	{6, 7, 8, 9, 0},
    	{5, 4, 3, 2, 1}};
    public static int count( int val  ) //static
    {
    	int count = 0;
    	for (int i = 0; i < m.length; i++) //repeats for num of rows
    	{
    		for (int b = 0; b < m[i].length; b++) //repeats for num of columns
    		{
    			if (val == m[i][b]) //if the point equals the parameter 'value'
    			{
    				count++;
    			}
    		}
    	}
		return count;
    }

    public String toString() //String method
    {
		String output = ""; //repeats for num of rows
		for (int i = 0; i < m.length; i++) //
		{
			for (int b = 0; b < m[i].length; b++) //repeats for num of columns
			{
				output += m[i][b] + " "; //adds point to output
			}
			output += "\n"; //spaces down
		}
		return "" + output;
	}
}
