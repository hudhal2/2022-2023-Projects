/**
 * WordRunner.java 03/20/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class WordRunner //class
{
	public static void main(String[] args)
	{
		Word one = new Word("chicken"); //instantiates word and gives ref: 'one'
		System.out.println(one); //outputs Word
		System.out.println("num vowels == " + one.getNumVowels()); //calls method and outputs num of vowels
		System.out.println("num chars == " + one.getLength()); //calls method and outputs length
		one.setWord("alligator"); //sets word to new paramater
		System.out.println("\n\n" + one); //outputs Word with new parameter
		System.out.println("num vowels == " + one.getNumVowels()); //calls method
		System.out.println("num chars == " + one.getLength()); //calls method
		one.setWord("elephant");
		System.out.println("\n\n" + one); //repeats with new paramters
		System.out.println("num vowels == " + one.getNumVowels());
		System.out.println("num chars == " + one.getLength());
	}
}