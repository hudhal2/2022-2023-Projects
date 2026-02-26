/**
 * MonsterRunner.java  11/10/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

import java.util.Scanner;

public class MonsterRunner
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in); //brings in input scanner
		System.out.print("Enter 1st monster's name : "); //inputs name
		String name = input.next(); //sets name to inputted string
		System.out.print("Enter 1st monster's size : ");
		int size = input.nextInt(); //sets varibale size to inputted int
		Monster detail1 = new Monster(name, size); //connects methods code, sets parameters to inputted variables

		System.out.print("Enter 2nd monster's name : ");
		String name2 = input.next();
		System.out.print("Enter 2nd monster's size : "); //sets size and name to input
		int size2 = input.nextInt();
		Monster detail2 = new Monster(name2, size2); //connects methods to inputted variables

		System.out.println("");
		System.out.println(detail1);
		System.out.println(detail2); //prints size and name of inputted values
		if (detail1.isBigger(detail2))
		{
			System.out.println("Monster one is bigger than Monster two."); //returns greater than if true
		}
		if (detail1.isSmaller(detail2))
		{
			System.out.println("Monster one is smaller than Monster two."); //returns less than if true
		}
		if (detail1.sameName(detail2))
		{
			System.out.println("Monster one has the same name as Monster two."); //returns equal if true
		}
	}
}

