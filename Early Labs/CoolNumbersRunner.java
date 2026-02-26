/**
 * CoolNumbersRunner.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class CoolNumbersRunner
{
	public static void main( String[] args )
	{
		System.out.println( CoolNumbers.countCoolNumbers(250) + " cool numbers between 6 - " + 250); //prints the result of the countCoolNumbers method with the parameter test case in the parenthesis
		System.out.println( CoolNumbers.countCoolNumbers(1250) + " cool numbers between 6 - " + 1250);
		System.out.println( CoolNumbers.countCoolNumbers(2250) + " cool numbers between 6 - " + 2250);
		System.out.println( CoolNumbers.countCoolNumbers(5500) + " cool numbers between 6 - " + 5500);
		System.out.println( CoolNumbers.countCoolNumbers(9500) + " cool numbers between 6 - " + 9500); //repeats with more test cases
		System.out.println( CoolNumbers.countCoolNumbers(23500) + " cool numbers between 6 - " + 23500);
		System.out.println( CoolNumbers.countCoolNumbers(32500) + " cool numbers between 6 - " + 32500);
	}
}