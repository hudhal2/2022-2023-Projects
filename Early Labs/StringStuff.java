/**
 * StringStuff.java  10/20/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class StringStuff
{
	private String word;

	public StringStuff( String w )
	{
	 	word = w;
	}

 	public String getFirstLastLetters()
 	{
	 	String first = word.substring(0, 1);
		String last = word.substring(word.length() - 1);
 		return "has first and last letters  :: " + first + "" + last; //outputs first and last letter
	}

 	public String getMiddleLetter()
 	{
	 	char middle = word.charAt(word.length() / 2); //divides sent len by 2 to find middle letter
 		return "has middle letter :: " + middle;
	}

 	public boolean sameFirstLastLetters()
 	{
	 	String first = word.substring(0, 1); //sets variables to first and last
		String last = word.substring(word.length() - 1);
 		return first.equals(last); //simple boolean to determine if first and last are equal
	}

 	public String toString()
 	{
 		return "" + word;
	}
}