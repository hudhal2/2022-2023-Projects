/**
 * Player.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

import java.util.ArrayList; //imports arrayList

public class Player //class
{
	private ArrayList<Card> hand;
	private int winCount; //instance variables

	public Player()
	{
		//instantiates vars
		hand = new ArrayList<Card>();
		winCount = 0;
	}

	public Player(int score)
	{
		//instantiates hand arrayList
		hand = new ArrayList<Card>();
		winCount = score; //sets winCount to win count
	}

	public void addCardToHand(Card a)
	{
		hand.add(a); //adds card to hand
	}

	public void resetHand()
	{
		hand.clear(); //clears hand
	}

	public void setWinCount(int numwins)
	{
		winCount = numwins; //sets winCount
	}

	public int getWinCount()
	{
		return winCount; //returns winCount
	}

	public int getHandSize()
	{
		return hand.size(); //returns handSize
	}

	public int getHandValue()
	{
		int value = 0;
		for (Card card : hand)
		{
			value += card.getValue();
		}
		return value; //sums up faces in hand
	}

	public boolean hit()
	{
		return getHandValue() < 21; //hits if under 21
	}

	public String toString()
	{
		return "hand = " + hand + " - " + getHandValue(); //outputs hand and value
	}
}