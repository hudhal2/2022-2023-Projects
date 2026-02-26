/**
 * StringRunner.java  10/25/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/
import java.util.Scanner;

public class StringRunner2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a word :: "); //inputs word
		String word = keyboard.next();
		StringStuff2 s = new StringStuff2(word); //sets word
		System.out.println( "has even length " + s.isEvenLength() ); //finds if even
		System.out.println( "has same first last letters " + s.sameFirstLastLetters() ); //finds if first and last are the same
		System.out.println( "ends with cat " + s.endsWith( "cat" ) ); //finds if cat is ending
	}
}