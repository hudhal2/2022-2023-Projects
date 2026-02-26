/**
 * Histogram.java  01/30/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/
import java.util.Scanner;
public class Histogram //class
{
	private int[] numCount; //instance var

	public Histogram(String line, int size ) //constructor with parameters
	{
		numCount = new int[size]; //sets array to correct length
		reset(line, size); //calls reset method PLEASE LET THIS BE RIGHT I'M GONNA BE SO SAD IF THIS MEANS POINTS OFF
	}

	public void reset(String line, int size) //reset method with new parmters
	{
		numCount = new int[size]; //sets array to size
		for (int i = 0; i < numCount.length; i++) //repeats for length of array
		{
			Scanner file = new Scanner(line); //instantiates scanner with 'line'
			while (file.hasNextInt()) //repeats while theres ints in line
			{
				if (file.nextInt() == i) //if the value of array equals the index
				{
					numCount[i]++; //adds 1 to the index of the array
				}
			}
		}
	}

	public void changeCount( int v, int a ) //no return method
	{
		if (v < numCount.length) //if v is less than length of array
		{
			numCount[v] += a; //adds 'a' to that index of the array
		}
	}
	public int getMax() //int method
	{
		int max = numCount[0]; //sets max to first value of array
		int index = 0; //local var
		for (int i = 0; i < numCount.length; i++) //repeats for length of array
		{
			if (numCount[i] > max) //if value of array is greater than max
			{
				max = numCount[i]; //sets max equal to the value in array
				index = i; //sets index equal to i
			}
		}
		return index; //returns index
	}

	public String toString() //string method
	{
		String output = ""; //sets output to nothing
		for (int i = 0; i < numCount.length; i++) //repeats for length of array
		{
			output += i + " - " + numCount[i] + " | "; //adds output format for each place
		}
		return output; //returns output
	}
}