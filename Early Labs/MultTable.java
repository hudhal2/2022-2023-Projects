/**
 * MultTable.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class MultTable
{
	private int number;
	private int stop; //instance varibables

	public MultTable()
	{
		number = 0;
		stop = 0; //constructor sets basis for variables
	}

	public MultTable(int num, int end)
	{
		setTable( num, end ); //constructor takes parameters
	}

	public void setTable(int num, int end)
	{
		number = num;
		stop = end;	 //sets varibables to parameters
	}

	public void printTable( )
	{
	 	System.out.println("multiplication table for " + number); //method calculates the mult table using the number variable multiplied by the index which increases in the for loop

	    for (int i = 1;   i <= stop;  i += 1)
		{
		 	System.out.println(i + "         " + i * number); //prints result
	 	}
	}
}
