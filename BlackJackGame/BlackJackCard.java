/**
 * BlackJackCard.java  04/10/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class BlackJackCard extends Card
{
	public BlackJackCard()
	{
		super(0, ""); //uses card constructor
	}

	public BlackJackCard(int f, String s) //parameters
	{
		super(f, s); //uses card constructor
	}

	public int getValue() //int method
	{
		if (getFace() == 1) //converts ace
		{
			return 11;
		}
		else if (getFace() >= 10)
		{
			return 10; //any face card is 10
		}
		else
		{
			return getFace(); //below 10 is real value besides ace
		}
	}
}
