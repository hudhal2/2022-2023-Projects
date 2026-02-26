/**
 * TheLine.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/
import java.util.Scanner;
public class TheLine
{
 	private String line; //creates instance variable

    public TheLine()
    {
     	line = ""; //constructor sets base value
    }

    public TheLine(String s)
    {
   		line = s; //constructor sets var to parameter s
    }

    public void setLine(String s)
    {
    	line = s; //set method sets var 'line' = string s
    }

	public int getLargest()
	{
		Scanner file = new Scanner(line); //creates scanner ref var
		int num = 0; //sets int var 'num' to 0
		int largest = 0; //sets int var largest to 0
		while ( file.hasNextInt()) //while there are ints left in the string
		{
			num = file.nextInt(); //sets num equal to the next int on the line
			if (num > largest)
			{
				largest = num; //sets largest equal to the int if it's greater than the variable largest
			}
		}
		return largest; //returns var largest
	}

	public String toString( )
	{
		return "" + line + " - Largest ==  " + getLargest() + "\n\n"; //prints the line, text, and largest
	}
}