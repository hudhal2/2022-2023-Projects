/**
 * AngryBearRunner.java  11/16/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class AngryBearRunner
{
   public static void main(String[] args)
	{
		AngryBear a = new AngryBear ( 10, 3 ); //connects runner to code and provides parameters
		System.out.println( a.isAngry() ); //outputs resulting boolean method
		AngryBear b = new AngryBear ( 10, 35 );
		System.out.println( b.isAngry() );
		AngryBear c = new AngryBear ( 1, 25 ); //repeats process with different test cases
		System.out.println( c.isAngry() );
		AngryBear d = new AngryBear ( 6, 40 );
		System.out.println( d.isAngry() );
		AngryBear e = new AngryBear ( 1, 1 );
		System.out.println( e.isAngry() );
		AngryBear f = new AngryBear ( 111, 111 );
		System.out.println( f.isAngry() );
	}
}
