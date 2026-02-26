/**
 * BlackJack.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

import java.util.Scanner;
import java.util.ArrayList; //imports

public class BlackJack
{
	private ArrayList<Player> players; //arraylist, player type

	public BlackJack() //constructor
	{
		players = new ArrayList<Player>(); //instantiates instance variable
	}

	public void playGame() //main method
	{
		Dealer dealer = new Dealer(); //instantiates dealer
		Scanner scanner = new Scanner(System.in); //instantiates scanner, preps for input
		boolean playAgain = true;
		//Takes in number of players and adds to arraylist
		System.out.print("How many players :: ");
		int playerCount = scanner.nextInt() + 1;
		for (int i = 0; i < playerCount; i++)
		{
			players.add(new Player(0));
		}
		while (playAgain) //repeats as long as player continues
		{
			dealer.shuffle();
			//clear each players deck and gives them 2 cards
			for (int i = players.size() - 1; i >= 0; i--)
			{
				players.get(i).resetHand();
				players.get(i).addCardToHand(dealer.deal());
				players.get(i).addCardToHand(dealer.deal());
				if (i == 0)
				{
					while (players.get(0).getHandValue() < 17) //if its the dealer (index 0) then keeps hitting while below 17
					{
						players.get(0).addCardToHand(dealer.deal());
					}
				}
				else
				{
				//for normal players, outputs hand and prompts to keep hitting
					System.out.println("Player " + i + " Current hand " + players.get(i));
					boolean playerTurn = true;
					while (playerTurn)
					{
						System.out.print("Do you want to hit? [Y/N] ");
						String choice = scanner.next().toLowerCase();
						if (choice.equals("y"))
						{
							players.get(i).addCardToHand(dealer.deal()); //adds a card to player's deck if they hit
							System.out.println("Current hand: " + players.get(i));
						}
						else if (choice.equals("n"))
						{
							playerTurn = false; //skips if they choose to stay
						}
						else
						{
							System.out.println("Invalid choice. Please choose Y or N.");
						}
						if (players.get(i).getHandValue() > 21)
						{
							System.out.println("You busted!"); //makes them skip if they busted
							playerTurn = false;
						}
						System.out.println();
					}
				}
			}
			//outputs each players hand and values
			for (int i = 0; i < players.size(); i++)
			{
				System.out.println();
				if (i == 0)
				{
					System.out.println("DEALER");
				}
				else
				{
					System.out.println("PLAYER " + i);
				}
				System.out.println("Hand Value :: " + players.get(i).getHandValue());
				System.out.println("Hand Size :: " + players.get(i).getHandSize());
				System.out.println("Cards in Hand :: " + players.get(i));
			}
			//outputs whether each player won or lost starting at top player
			System.out.println();
			int count = 0; //count keeps track of player victories
			for (int i = players.size() - 1; i >= 0; i--)
			{
				if (i == 0)
				{
					if (count == 0) //if no players won
					{
						System.out.println("Dealer won all!");
					}
					else if (count < players.size() - 1) //if some players won
					{
						System.out.println("Dealer won some!");
					}
					else //if no players won
					{
						System.out.println("Dealer lost all!");
					}
				}
				else if (players.get(i).getHandValue() > 21) //if the player busted
				{
					System.out.println("Player " + i + " busted!");
					players.get(0).setWinCount(players.get(0).getWinCount() + 1); //adds to dealer win count
				}
				else if (players.get(0).getHandValue() > 21 && players.get(i).getHandValue() <= 21) //if the dealer busted
				{
					System.out.println("Player " + i + " won!");
					players.get(i).setWinCount(players.get(i).getWinCount() + 1); //adds to player win count
					count++;
				}
				else if (players.get(i).getHandValue() > players.get(0).getHandValue() && players.get(0).getHandValue() <= 21) //if player beat dealer
				{
					System.out.println("Player " + i + " won!");
					players.get(i).setWinCount(players.get(i).getWinCount() + 1);
					count++;
				}
				else if (players.get(i).getHandValue() == players.get(0).getHandValue()) //if they tied
				{
					System.out.println("Player " + i + " tied!"); //no points awarded
				}
				else
				{
					System.out.println("Player " + i + " Lost!"); //if dealer beat player
					players.get(0).setWinCount(players.get(0).getWinCount() + 1); //dealer gets point
				}
			}
			System.out.println();
			//outputs the win counts
			for (int i = 0; i < players.size(); i++)
			{
				if (i == 0)
				{
					System.out.println("Dealer has won " + players.get(0).getWinCount() + " time(s) and lost " + count + " time(s)");
				}
				else
				{
					System.out.println("Player has won " + players.get(i).getWinCount() + " time(s).");
				}
			}
			System.out.println();
			//prompts to play again
			System.out.print("Do you want to play again? [Y,y,N,n] :: ");
			String choice = scanner.next().toLowerCase();
			if (choice.equals("N") || choice.equals("n"))
			{
				playAgain = false;
			}
			else if (choice.equals("Y") || choice.equals("y"))
			{
				playAgain = true;
			}
			System.out.println();
		}
		scanner.close();
	}

	public static void main(String[] args)
	{
		BlackJack game = new BlackJack(); //instantiates BlackJack
		game.playGame(); //calls playGame method
	}
}