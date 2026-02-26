/**
 * CharacterAnalyzer.java  11/15/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class CharacterAnalyzer
{
	private char theChar; //defines instance variable

	public CharacterAnalyzer()
	{
		theChar = '-'; //sets variable 'thechar' to blank
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c; //sets variable to parameter 'c'
	}

	public void setChar(char c)
	{
		theChar = c; //creates command that sets variable to 'c'
	}

	public char getChar()
	{
		return theChar; //gives thechar
	}

	public boolean isUpper( )
	{
		if ((int)theChar > 64 && (int)theChar < 91) //returns true if theChar is greater than 64 and less than 91
		{
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		if ((int)theChar > 96 && (int)theChar < 123) //returns true if theChar is greater than 96 and less than 123
		{
			return true;
		}
		return false;
	}

	public boolean isNumber( )
	{
		if ((int)theChar > 47 && (int)theChar < 58) //returns true if theChar is greater than 47 and less than 58 aka a number between 0-9
		{
			return true;
		}
		return false;
	}

	public int getASCII( )
	{
		return theChar; //gives ascii value
	}

	public String toString()
	{
		if (isUpper() == true) //returns isUpper command to determine if char is upper
		{
			return "" + getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";
		} 

		else if (isLower() == true) //returns isLower command to determine if char is lower 
		{
			return "" + getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";
		}

		else if (isNumber() == true) //returns isNumber command to determine if char is a number
		{
			return "" + getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		return "";
	}
}