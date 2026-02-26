/**
 * CardTestOne.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class CardTestOne
{
	public static void main( String[] args )
	{
		//uses card constructor but BlackJack output
		Card one = new BlackJackCard(); //instantiates card as BlackJack
		System.out.println(one);

		Card two = new BlackJackCard(1, "DIAMONDS"); //repeats with new paramters
		System.out.println(two);

		Card three = new BlackJackCard(4, "CLUBS");
		System.out.println(three);

		Card four = new BlackJackCard(12, "SPADES"); //repeats
		System.out.println(four);

		Card five = new BlackJackCard(12, "HEARTS");
		System.out.println(five);

		Card six = new BlackJackCard(9, "SPADES");
		System.out.println(six);

		System.out.println(one.equals(two)); //compares the objects
		System.out.println(one.equals(one));
		System.out.println(four.equals(five));
		System.out.println(three.equals(four));
	}
}