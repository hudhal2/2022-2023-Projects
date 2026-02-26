/**
 * Quadratic.java  10/08/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class Quadratic
{
	public static double getRootOne( int a, int b, int c )
	{
		return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); //Uses quadratic formula
	}

	public static double getRootTwo( int a, int b, int c )
	{
		return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
	}
}