/**
 * ExpressionSolverRunner.java 03/06/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class NumberRunner
{
	public static void main(String[] args)
	{
		int[] nums = {7, 28, 496, 1111, 199, 201, 17}; //array
		for ( int num : nums ) //repeats for length of array
		{
		 	Number one = new Number( num ); //instantiates with item at num in array
		 	if ( one.isOdd() ) //calls isOdd method
		 	{
				System.out.print( one + " is odd.\n" ); //outputs
		 	}
		 	else
		 	{
		 		System.out.print( one + " is not odd.\n" ); //outputs
		 	}
 			if ( one.isPerfect() ) //calls isPerfect method
 			{
 				System.out.print( one + " is perfect.\n" ); //outputs
 			}
 			else
 			{
 				System.out.print( one + " is not perfect.\n" ); //outputs
 			}
		}
	}
}