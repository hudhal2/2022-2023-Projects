/**
 * QuadraticRunner.java  10/08/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

import java.util.Scanner;


public class QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		System.out.print("Enter a :: ");
		int quadA = keyboard.nextInt();
		System.out.print("Enter b :: ");
		int quadB = keyboard.nextInt();
		System.out.print("Enter c :: ");
		int quadC = keyboard.nextInt(); //Inputs abc values


		Quadratic ref = new Quadratic();
		System.out.printf( "rootone :: %.2f\n", Quadratic.getRootOne( quadA, quadB, quadC ) );
		System.out.printf( "roottwo :: %.2f\n", Quadratic.getRootTwo( quadA, quadB, quadC ) );
	}
}

/*

Sample Data :
5 -8 3
3 2 -7
9 6 1


Sample Output :
Enter a :: 5
Enter b :: -8
Enter c :: 3


rootone :: 1.00
roottwo :: 0.60




Enter a :: 3
Enter b :: 2
Enter c :: -7


rootone :: 1.23
roottwo :: -1.90




Enter a :: 9
Enter b :: 6
Enter c :: 1


rootone :: -0.33
roottwo :: -0.33

*/