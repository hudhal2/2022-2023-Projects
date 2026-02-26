/**
 * RecursionFunTwo.java  04/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class RecursionFunTwo
{
	public static int countChickens(String word) //static method returns int
	{
		int count = 0; //local int var
		int index = word.indexOf("chicken"); //local int var set to the index of where chicken starts in string
		if (index > -1) // if chiken exists in the string
		{
			count++; //adds 1 to count
			return count + countChickens(word.substring(0, index) + word.substring(index + 7, word.length())); //returns count + method with chopped string
		}
		return count; //outputs occurances of chicken in string
	}
}