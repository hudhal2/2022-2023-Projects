/**
 * BoxRunner.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from no one
 *
*/

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class BoxRunner
{
	public static void main( String[] args ) throws IOException //introduces main arg and clears IOE error
	{
	 	Scanner file = new Scanner(new File("box.dat")); //creates ref for scanner in the data file
		int size = file.nextInt(); //sets var 'size' to the first in the data file
		file.nextLine(); //goes to the next line of the data file
		Box a = new Box(); //ref for Box
		for (int i = 0; i < size; i++) //repeats 'size' number of times
		{
		 	a.setBox(file.next(), file.nextInt()); //runs set method with parameters of the next int and string in the data
			System.out.println(a); //outputs Box() using ref variable 'a'
		}
	}
}