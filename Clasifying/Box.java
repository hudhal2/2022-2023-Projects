/**
 * Box.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from no one
 *
*/

public class Box
{
 	private String let;
 	private int size; //instance variables

	public Box()
	{
	 	let = "";
		size = 0; //base value constructor
	}

	public Box(String letter, int mag)
	{
	 	let = letter; //constructor sets to parameters
		size = mag;
	}

	public void setBox(String letter, int mag)
	{
	 	let = letter;
		size = mag; //void set method doesn't return but sets vars to parameters
	}

	public String build()
	{
	 	String building = ""; //creates local var
		for (int i = 0; i < size; i++) //repeats 'size' times
		{
		 	for (int b = 0; b < size; b++) //repeats 'size' times but nested
			{
		 	 	building += let; //adds 'let' to the line
			}
			building += "\n"; //goes to the next line
		}
		return building; //returns the product of the loops
	}

	public String toString()
	{
		String output = build(); //sets output var to build() method
		return output + "\n"; //returns the output variable and goes to the next line
	}
}