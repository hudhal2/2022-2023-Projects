/**
 * StringRunner.java  10/20/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/
import java.util.Scanner;

public class StringRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a word :: "); //inputs word
		String word = keyboard.next();

		//add test cases
		StringStuff test = new StringStuff(word);
		System.out.println(test.getFirstLastLetters());
		System.out.println(test.getMiddleLetter());
		System.out.println("has same first and last letter :: " + test.sameFirstLastLetters()); //outputs data from StringStuff
	}
}