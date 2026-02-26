/**
 * CoolChickenRunner.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class CoolChickenRunner
{
 	public static void main(String[] args)
	{
		CoolChicken a = new CoolChicken(5.9, 7, "coolio" ); //connects runner to code and provides parameters for CoolChicken
		System.out.println( a.isCool() );
		CoolChicken b = new CoolChicken(150.5, 5, "foghorn" );
		System.out.println( b.isCool() );
		CoolChicken c = new CoolChicken(314.1, 5, "notcool" ); //repeats with more test cases
		System.out.println( c.isCool() );
		CoolChicken d = new CoolChicken(212, 56, "ralph" );
		System.out.println( d.isCool() );
	}
}

