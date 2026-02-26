/**
 * CardTester.java  05/19/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabe
 *
*/

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card one = new Card("3", "Hearts", 3);
		Card two = new Card("2", "Spades",3);
		Card three = new Card("3", "Hearts", 3);
		System.out.println("One matches two?" + one.matches(two));
		System.out.println("One matches three?" + one.matches(three));    
		System.out.println("Suit of Card One: " + one.suit());
		System.out.println("Card one: " + one.toString());
	}
}
