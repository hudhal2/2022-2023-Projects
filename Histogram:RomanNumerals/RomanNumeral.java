/**
 * RomanNumeral.java  01/26/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - Cody helped me once and the rest was all me
 *
*/

public class RomanNumeral //class
{
	private Integer number; //instance variables
	private String roman;

	private int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //instance variable array
	private String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; //instance variable array
	public RomanNumeral(String str)
	{
		roman = str; //construtor w parameter for string
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;
		setNumber(number); //constructor with parameter for Integer and calls setNumber method
	}

	public void setNumber(Integer num) //method with no return (void)
	{
		number = num; //sets var 'number' to parameter
		roman = ""; //sets roman string to nothing
		for (int i = 0; i < NUMBERS.length; i++) //repeats for length of array
		{
			while ( NUMBERS[i] <= number) //if the value at i in the array is less than or equal to number,
			{
				roman += LETTERS[i]; //adds the value at i to roman string
				number -= NUMBERS[i]; //subtracts the value at i to number
			}
		}
	}

	public void setRoman(String rom) //method with no return (void)
	{
		number = 0; //sets number to 0
		roman = rom; //sets roman to parameter
		while (roman.length() > 0) //while the String has content
		{
			for (int i = 0; i < LETTERS.length; i++) //repeats for length of array
			{
				if (roman.length() > 0) //if string 'roman' has content
				{
					if (LETTERS[i].equals(roman.substring(0, 1))) //if the value in the array equals the first letter in roman
					{
						number += NUMBERS[i]; //adds the value at i of the NUMBERS array to number
						if (roman.length() > 1) //if length of roman is more than 1
						{
							roman = roman.substring(1, roman.length()); //takes off the first char in roman
						}
						else
						{
							roman = ""; //if roman only has one char left, sets it to nothing
						}
					}
					if (roman.length() >= 2) //if roman is longer than or equal to 2
					{
						if (LETTERS[i].equals(roman.substring(0, 2))) //if the value i in the array equals the first two letters of roman
						{
							number += NUMBERS[i]; //adds the value in the array NUMBERS to number
							if (roman.length() > 2) //if the length of roman is greater than 2
							{
								roman = roman.substring(2, roman.length()); //chops the first two chars in roman
							}
							else
							{
								roman = ""; //otherwise sets it to nothing
							}
						}
					}
				}
			}
		}
	}

	public Integer getNumber() //Int method
	{
		return number; //returns number
	}

	public String toString()
	{
		return roman + "\n"; //returns roman and skips line
	}
}