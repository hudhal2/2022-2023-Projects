/**
 * Words.java 03/20/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

import java.util.ArrayList; //imports ArrayLists
public class Words //class
{
	private ArrayList<Word> words; //instance variable arrayList

	public Words() //constructor
	{
		words = new ArrayList<Word>(); //instantiates arrayList type Word
	}

	public Words(String[] wordList)
	{
		words = new ArrayList<Word>(); //instantiates arrayList type Word
		for (int i = 0; i < wordList.length; i++) //repeats for length of array
		{
			words.add(new Word(wordList[i])); //adds each word in array to ArrayList
		}
	}

	public int countWordsWithXChars(int size) //int method
	{
		int count = 0; //local var
		for (int i = 0; i < words.size(); i++) //repeats for length of arrayList
		{
			if (words.get(i).getLength() == size) //if the word at 'i' equals size paramteter
			{
				count++;
			}
		}
		return count;
	}

	public int removeWordsWithXChars(int size) //int method
	{
		int index = 0;
		int count = 0; //local vars
		while (index < words.size()) //while index is less than size of arrayList
		{
			if (words.get(index).getLength() == size) //if the length of the word at 'index' equals size
			{
				count += words.get(index).getNumVowels(); //adds the number of vowels in the word to count
				words.remove(index); //removes the word at index in the arrayList
				index--; //minus 1 from index
			}
			index++;
		}
		return count;
	}

	public int countWordsWithXVowels(int numVowels) //int method
	{
		int count = 0; //local var
		for (int i = 0; i < words.size(); i++) //repeats for length of arrayList
		{
			if (words.get(i).getNumVowels() == numVowels) //if the word at 'i; in arrayList has 'numVowels' vowels
			{
				count++; //adds 1 to count
			}
		}
		return count;
	}

	public String toString() //outputs
	{
		return "" + words;
	}
}