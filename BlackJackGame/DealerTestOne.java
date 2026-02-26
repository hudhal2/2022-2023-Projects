/**
 * DealerTestOne.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class DealerTestOne
{
	public static void main( String[] args )
	{
		//Code to test the Dealer
		Dealer dealer = new Dealer();
		Player player = new Player();

		dealer.shuffle();

		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal()); //give each player and dealer 2 cards
		player.addCardToHand(dealer.deal());
		dealer.addCardToHand(dealer.deal());

		int playerTotal = player.getHandValue();
		int dealerTotal = dealer.getHandValue(); //sets local variables to each's value

		System.out.println("\nPLAYER ");
		System.out.println("Hand Value :: " + playerTotal );
		System.out.println("Hand Size :: " + player.getHandSize() ); //outputs player stats
		System.out.println("Cards in Hand :: " + player.toString() );
		System.out.println("\nDEALER ");
		System.out.println("Hand Value :: " + dealerTotal );
		System.out.println("Hand Size :: " + dealer.getHandSize() );
		System.out.println("Cards in Hand :: " + dealer.toString() ); //outputs dealer stats

		if (playerTotal > 21 && dealerTotal <= 21)
		{
			System.out.println("\nDealer wins - Player busted!");
		}
		else if (playerTotal <= 21 && dealerTotal > 21)
		{
			System.out.println("\nPlayer wins - Dealer busted!"); //compares data
		}
		else if (playerTotal > 21 && dealerTotal > 21)
		{
			System.out.println("Both players bust!");
		}
		else if (playerTotal < dealerTotal)
		{
			System.out.println("\nDealer has bigger hand value!");
		}
		else
		{
			System.out.println("\nPlayer has bigger hand value!");
		}
	}
}