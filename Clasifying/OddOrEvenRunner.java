/**
 * OddOrEvenRunner.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class OddOrEvenRunner
{
	public static void main( String[] args ) throws IOException /* <---- Notice this. It is required when trying to read from a file.
	It means that is something goes wrong and IOException (Input/Output error shoud be displayed */
	{
		Scanner file = new Scanner(new File("oddoreven.dat")); //file scanner syntax code
		int size = file.nextInt(); //sets variable size to the next file in the .dat file
		file.nextLine(); //goes to the next line (number) in the data file
		OddOrEven a = new OddOrEven(); //creates ref variable 'a' for OddOrEven code
		for (int i = 0; i < size; i++) //runs a for loop to cycle through the data
		{
		 	int num = file.nextInt();
		    a.setNum(num); //sets num to the next number in the data file
		    System.out.println(a); //prints if it's odd or even
		}
	}
}