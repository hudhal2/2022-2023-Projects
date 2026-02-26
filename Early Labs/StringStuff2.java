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
public class StringStuff2
{
	private String word; //sets instance variable

	public StringStuff2( String w )
	{
	 	word = w; //def variable
	}
	public void setString(String w)
	{
	 	w = word; //def variable
	}
 	public boolean isEvenLength()
 	{
	 	int length = word.length();
		if (length % 2 == 0) //determines if even
		{
		 	return true;
		}
		return false;
	}

	public boolean endsWith( String b )
	{
	 	if (word.substring(word.length() - b.length(), word.length()).equals(b))
		{
		 	return true;
		}
		return false;
	}
 	public boolean sameFirstLastLetters()
 	{
	 	if (word.charAt(0) == word.charAt(word.length() - 1)) //determines if first and last letter are same
		{
 	 	 	return true;
	    }
		return false;
	}
 	public String toString()
 	{
 		return "";
	}
}