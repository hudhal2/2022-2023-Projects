/**
 * PlayerTestOne.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class PlayerTestOne
{
	public static void main( String[] args )
	{
		Player player = new Player(); //instantiates player

		Deck deck = new Deck(); //new deck
		deck.shuffle(); //shuffles

		player.addCardToHand(deck.nextCard());
		player.addCardToHand(deck.nextCard()); //gives player 2 cards

		System.out.println("\n\ntoString");
		System.out.println(player); //outputs values

		System.out.println("\n\nhandValue");
		System.out.println(player.getHandValue());

		player.addCardToHand(deck.nextCard()); //gives 2 more cards
		player.addCardToHand(deck.nextCard());

		System.out.println("\n\ntoString");
		System.out.println(player); //outputs

		System.out.println("\n\nhandValue");
		System.out.println(player.getHandValue()); //calls handValue method
	}
}