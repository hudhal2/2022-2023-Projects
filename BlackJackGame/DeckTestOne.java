/**
 * DeckTestOne.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class DeckTestOne
{
	public static void main( String[] args )
	{
		Deck deck = new Deck(); //instantiates deck
		for (int i = 0; i < Deck.NUMCARDS; i++ ) //repeats for len of deck (52)
		{
			System.out.println(deck.nextCard()); //outputs each card
		}
		System.out.println("\n\n");
		System.out.println("num cards left in the deck == " + deck.numCardsLeft()); //calls methods
		System.out.println("\n\nshuffling");
		deck.shuffle();
		System.out.println("num cards left in the deck == " + deck.numCardsLeft()); //repeats
		System.out.println("\n\ntoString");
		System.out.println(deck);
	}
}