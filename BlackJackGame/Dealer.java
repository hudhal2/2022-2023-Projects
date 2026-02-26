/**
 * Dealer.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class Dealer extends Player //subclass of Player
{
	private Deck deck; //instance var type deck

	public Dealer()
	{
		super(); //calls constructor of Player
		deck = new Deck(); //insantiates deck
		deck.shuffle(); //shuffles
	}

	public void shuffle()
	{
		deck.shuffle(); //shuffles deck
	}

	public Card deal()
	{
		return deck.nextCard(); //goes to next card
	}

	public int numCardsLeftInDeck()
	{
		return deck.numCardsLeft(); //returns num left
	}

	public boolean hit()
	{
		return getHandValue() < 17; //hits if hand is less than 17
	}
}