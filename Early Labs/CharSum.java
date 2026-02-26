/**
 * CharSum.java  10/09/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help Gabriel and Cody
 *
*/

public class CharSum
{
    private String word;
    private int sum;
    private char letter;

	public CharSum()
	{
	}
	public CharSum(String word, char let)
	{
    	word = word;
		letter = let; //sets variables
	}


	public void setWord(String w,char let)
	{
		word = word;
		letter = let;
	}

	public void locateAndAdd()
	{
		int target = word.indexOf(letter);
		int target2 = word.lastIndexOf(letter);
		char bef = word.charAt(target-1); //finds letter within word
		char aft = word.charAt(target + 1);
		char bef2 = word.charAt(target2-1);
		char aft2 = word.charAt(target2 + 1);
		int befAsc = (int) bef;
		int aftAsc = (int) aft;
		int bef2Asc = (int) bef2;
		int aft2Asc = (int) aft2; //converts char to int
		int sum = befAsc + aftAsc + bef2Asc + aft2Asc; //adds up

	}

	public String toString()
	{
		return "The letters surrounding the "+letter+"s in " + word + " have a total of " + sum + "\n";
	}//outputs
}