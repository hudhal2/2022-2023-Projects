/**
 * Word.java 03/20/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

import java.util.ArrayList; //imports arrayList
public class Word //class
{
	private static String vowels = "AEIOUaeiou"; //accessible variable anywhere in class
	private ArrayList<String> letters; //instance variable

	public Word() //constructor
	{
		letters = new ArrayList<String>(); //instantiates letters arrayList
	}

	public Word(String s) //instantiates letters arrayList and gives paramter for word
	{
		letters = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) //repeats for length of word
		{
			letters.add(Character.toString(s.charAt(i))); //adds the letter at index 'i' to the arrayList
		}
	}

	public void setWord(String s) //no output method
	{
		letters = new ArrayList<String>(); //instantiates letters arrayList
		for (int i = 0; i < s.length(); i++) //repeats for length of word
		{
			letters.add(Character.toString(s.charAt(i))); //adds the letter at index 'i' to the arrayList
		}
	}

	public int getNumVowels() //int method
	{
		int count = 0; //local var
		for (int i = 0; i < letters.size(); i++) //repeats for arrayList size
		{
			for (int b = 0; b < vowels.length(); b++) //repeats for len of vowels
			{
				if (letters.get(i).equals(Character.toString(vowels.charAt(b)))) //if the letter at index 'i' equalds letter at 'b' in vowels
				{
					count++; //adds 1 to count
				}
			}
		}
		return count;
	}

	public int getLength() //int method
	{
		return letters.size(); //returns size of arrayList
	}

	public String toString()
	{
		String output = ""; //local var
		for (int i = 0; i < letters.size(); i++) //repeats for length of arrayList
		{
			output += letters.get(i); //adds the letter at 'i' to output
		}
		return output;
	}
}