/**
 * MultTensRunner.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from no one
 *
*/

public class MultTensRunner
{
	public static void main( String[] args )
	{
		System.out.println( MultTens.go( 1 ) ); //runs method from MultTens code
		System.out.println( MultTens.go( 2 ) );
		System.out.println( MultTens.go( 13 ) ); //runs test cases with different x values
		System.out.println( MultTens.go( 4 ) );
		System.out.println( MultTens.go( 10 ) );
		System.out.println( MultTens.go( -5 ) );
		System.out.println( MultTens.go( 0 ) );
		System.out.println( MultTens.go( 6 ) );
	}
}