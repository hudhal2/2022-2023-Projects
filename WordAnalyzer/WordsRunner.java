/**
 * WordsRunner.java 03/20/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class WordsRunner //class
{
	public static void main( String[] args )
	{
		String[] a = "one two three four five six seven alligator".split(" "); //adds each word to array
		Words test = new Words(a); //instantiates
		System.out.println(test); //outputs Words
		System.out.println("word with 2 vowels = " + test.countWordsWithXVowels(2)); //calls method with paramter
		System.out.println("word with 3 vowels = " + test.countWordsWithXVowels(3));
		System.out.println("word with 4 vowels = " + test.countWordsWithXVowels(4)); //repeats
		System.out.println("word with 2 chars = " + test.countWordsWithXChars(2));
		System.out.println("word with 3 chars = " + test.countWordsWithXChars(3));
		System.out.println("word with 4 chars = " + test.countWordsWithXChars(4));
		System.out.println("word with 5 chars = " + test.countWordsWithXChars(5));
		int vowelsRemoved = test.removeWordsWithXChars(3); //creates variable and calls method
		System.out.println("\nafter removing words with 3 chars \n" + test); //outputs Words again after the remove method
		System.out.println("\nnumber of vowels in the words removed == " + vowelsRemoved); //outputs the variable 'vowelsRemoved'
		System.out.println("\n\n"); //spaces down
		String[] b = "fun fly four six times ten plus eight".split(" "); //new array
		Words test2 = new Words(b);
		System.out.println(test2);
		System.out.println("word with 2 vowels = " + test2.countWordsWithXVowels(2));
		System.out.println("word with 3 vowels = " + test2.countWordsWithXVowels(3));
		System.out.println("word with 4 vowels = " + test2.countWordsWithXVowels(4));
		System.out.println("word with 2 chars = " + test2.countWordsWithXChars(2)); //repeats with new parameters
		System.out.println("word with 3 chars = " + test2.countWordsWithXChars(3));
		System.out.println("word with 4 chars = " + test2.countWordsWithXChars(4));
		System.out.println("word with 5 chars = " + test2.countWordsWithXChars(5));
		vowelsRemoved = test2.removeWordsWithXChars(3);
		System.out.println("\nafter removing words with 3 chars \n" + test2);
		System.out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		System.out.println("\n\n");
		String[] c = "alligator chicken dog cat pig buffalo".split(" ");
		Words test3 = new Words(c);
		System.out.println(test3);
		System.out.println("word with 2 vowels = " + test3.countWordsWithXVowels(2));
		System.out.println("word with 3 vowels = " + test3.countWordsWithXVowels(3));
		System.out.println("word with 4 vowels = " + test3.countWordsWithXVowels(4)); //repeats with new parameters
		System.out.println("word with 2 chars = " + test3.countWordsWithXChars(2));
		System.out.println("word with 3 chars = " + test3.countWordsWithXChars(3));
		System.out.println("word with 4 chars = " + test3.countWordsWithXChars(4));
		System.out.println("word with 9 chars = " + test3.countWordsWithXChars(9));
		vowelsRemoved = test3.removeWordsWithXChars(3);
		System.out.println("\nafter removing words with 3 chars \n" + test3);
		System.out.println("\nnumber of vowels in the words removed == " + vowelsRemoved);
		System.out.println("\n\n");
	}
}