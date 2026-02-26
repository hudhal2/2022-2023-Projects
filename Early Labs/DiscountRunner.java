/**
 * StringRunner.java  10/20/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/
import java.util.Scanner; //imports scanner

public class DiscountRunner
{
	public static void main( String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the original bill amount :: "); //inputs og cost
		double amt = keyboard.nextDouble();
		Discount d = new Discount( amt ); //refers Discount code
		System.out.println("Bill after discount :: " + String.format("%.2f" , d.getTheBill())); //apllies and outputs discount
	}
}