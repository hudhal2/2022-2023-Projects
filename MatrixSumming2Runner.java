/**
 * MatrixSumming2Runner.java  03/24/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class MatrixSumming2Runner //class
{
	public static void main( String[] args ) throws IOException
	{
		int a = 0; //local vars
		int b = 0;
		Scanner file = new Scanner(new File("matsum.dat")); //creates scanner ref for file
		file.next(); //skips to next item
		while (file.hasNext()) //while file has more items
		{
			a = Integer.parseInt(file.next()); //sets a to next val
			b = Integer.parseInt(file.next()); //sets b to next val
			System.out.println("The sum of " + a + "," + b + " is " + MatrixSumming2.sum(a, b) + "."); //outputs and calls sum method
		}
	}
}



