/**
 * GCDRunner.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class GCDRunner
{
	public static void main( String[] args )
	{
	 	System.out.println( "the gcd of 5 and 25 is " + GCD.getGCD( 5, 25 ) ); //provides parameter test values and runs method from GCD code which is public because its static
		System.out.println( "the gcd of 4 and 400 is " + GCD.getGCD( 4, 400 ) );
		System.out.println( "the gcd of 8 and 80 is " + GCD.getGCD( 8, 80 ) );
		System.out.println( "the gcd of 15 and 45 is " + GCD.getGCD( 15, 45 ) );
		System.out.println( "the gcd of 6 and 66 is " + GCD.getGCD( 6, 66 ) ); //repeats with more test values
		System.out.println( "the gcd of 9 and 9 is " + GCD.getGCD( 9, 9 ) );
		System.out.println( "the gcd of 9 and 543 is " + GCD.getGCD( 9, 543 ) );
		System.out.println( "the gcd of 15 and 40 is " + GCD.getGCD( 15, 40 ) );
		System.out.println( "the gcd of 6 and 51 is " + GCD.getGCD( 6, 51 ) );
	}
}