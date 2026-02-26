/**
 * Social2.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/
import java.util.Scanner;
public class Social2
{
 	private String socialNum; //instance var

	public Social2()
	{
		socialNum = ""; //constructor sets base
	}

	public Social2(String soc)
	{
		socialNum = soc; //constructor sets to paramter
	}

	public void setSocial(String soc)
	{
		socialNum = soc; //method sets soc to string paramter soc
	}

	public int getSum()
	{
		Scanner test = new Scanner(socialNum); //creates ref for Scanner to go through the string
		test.useDelimiter("\\-"); //uses delimiter on '-'
		int sum = 0;
		int num = 0; //sets ints to 0
		while (test.hasNextInt()) //repeats while the string has ints
		{
			num = test.nextInt(); //sets num to the new int
			sum += num; //adds int to sum
		}
		return sum; //returns sum
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a sum of " + getSum() + "\n\n"; //outputs text and sum
	}
}