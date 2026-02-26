/**
 * TheLineRunner.java  01/13/2023
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

public class TheLineRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("line.dat")); //scanner ref for the data
		int size = file.nextInt(); //sets int 'size' equal tothe next first int in the data file
		file.nextLine(); //goes to the next line of the data
		TheLine a = new TheLine(); //ref for theLine
		for (int i = 0; i < size; i++) //goes through each line of the data file
		{
			a.setLine(file.nextLine()); //sets theLine equal to the next line
		 	System.out.println(a); //runs theLine
		}
	}
}