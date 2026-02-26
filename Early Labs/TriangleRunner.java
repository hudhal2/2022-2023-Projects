/**
 * TriangleRunner.java  10/09/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

import java.util.Scanner;

public class TriangleRunner  //this class is used to test Triangle
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();
		System.out.println("");
		Triangle ref = new Triangle(a, b, c);
		System.out.println(a + " " + b + " " + c); //prints abc
		ref.calcPerimeter();
		System.out.println("Area == " + String.format("%.05f" , ref.getArea())); //refers calculations from Triangle
	}
}

/*

Sample Data :
3 3 3
7 8 9
10 9 11

Sample Output :
Enter side A ::  3
Enter side B ::  3
Enter side C ::  3

3 3 3
Area == 3.89711




Enter side A ::  7
Enter side B ::  8
Enter side C ::  9

7 8 9
Area == 26.83282





Enter side A ::  10
Enter side B ::  9
Enter side C ::  11

10 9 11
Area == 42.42641

*/