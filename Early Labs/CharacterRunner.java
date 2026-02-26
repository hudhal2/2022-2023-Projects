/**
 * CharcterRunner.java  11/15/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

import static java.lang.System.*; //brings in import static
import java.util.Scanner; //brings in input scanner

public class CharacterRunner
{
	public static void main ( String[] args )
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter :: "); //inputs character
		char letter = input.next().charAt(0); //sets char to inputted value
		CharacterAnalyzer test = new CharacterAnalyzer(letter); //refers CharacterRunner to CharacterAnalyzer
		test.setChar(letter); //determines status of char
		System.out.println(test); //outputs the result

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char

		System.out.print("Enter a letter :: ");
		letter = input.next().charAt(0); //sets letter to new inputted char
		test.setChar(letter);
		System.out.println(test); //outputs the status of char
	}
}