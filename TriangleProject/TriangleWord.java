/**
 * TriangleWord.java  12/6/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class TriangleWord
{
 	private String word; //creates instance variable

	public TriangleWord(String w)
	{
		word = w; //sets variblae to parameter 'w'
	}

	public String toString()
	{
		String line = "";
		String space = ""; //sets string variables to blank
		int inbet = 0;
		int len = 0; //sets int variblaes to 0
		for (int i = 1; i <= word.length(); i++) //loops once for every letter in the word
		{
			line = "";
			if ( i == word.length()) //if it's one the last letter (last line of the pyramid)
			{
				for (int y = word.length(); y >= 1; y--)
				{
					line += "" + word.charAt(y - 1); //adds the word backwards to 'line'
				}
				for (int x = 2; x <= word.length(); x++)
				{
					line += "" + word.charAt(x - 1); //adds the word forwards to 'line' minus the first letter
				}
			}
			else
			{
				space = "";
				len = (word.length() * 2) - 1;
				for ( int w = 1; w <= len; w++ )
				{
					space += " "; //adds the number of spaces as characters on the last line of the pyramid to the variable 'space'
				}
				if (i == 1)
				{
					line = space.substring(0, len / 2) + word.charAt(i - 1); //if it's the first line, adds half the distance of spaces + the first letter of the word
				}
				else
				{
			   		line = space.substring(0, (len / 2) - i + 1) + word.charAt(i - 1) + space.substring(0, inbet - 1) + word.charAt(i - 1); //otherwise adds two of the next letter with space
				}
				inbet += 2; //increases the amt of spaces inbetween the two letters after each line
			}
			System.out.println(line);
		}
		String output = "";
		return output + "\n";
	}
}