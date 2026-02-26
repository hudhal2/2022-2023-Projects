/**
 * TriangleOne.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class TriangleOne
{
	public static void print( String word ) //creates static method and provides parameter
	{
		for ( int i = word.length(); i >= 0; i -= 1 ) //starts at the length of of the word and goes down by 1 until it reaches 0
		{
		 	System.out.println( word.substring( 0, i ) ); //prints the section of the word from the beginning ot the index
		}
	}
}
