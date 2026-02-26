/**
 * RationalRunner.java  01/5/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class RationalRunner
{
	public static void main( String[] args )
	{
		Rational rOne = new Rational(1, 2); //Sets ref variables with parameters for first fraction
		Rational rTwo = new Rational(2, 3); //Sets ref variables with parameters for second fraction

		System.out.println("\n\nrOne = " + rOne); //prints fraction 1
		System.out.println("rTwo = " + rTwo); //prints fraction 2

		System.out.println( "1/2 > 2/3 == " + rOne.isBigger(rTwo) ); //calls isBigger method and determines if frac1 is bigger than frac2

		rOne.add(rTwo); //calls add method and adds frac1 and frac2
		System.out.println("\n\nrOne.add(rTwo) = " + rOne); //prints the result

		rOne.setRational(1, 2);
		rTwo.setRational(1, 3); //sets new fractions

		System.out.println( "1/2 > 1/3 == " + rOne.isBigger(rTwo) ); //used isBigger method to determine if frasc1 is bigger than frac2
		rOne.add(rTwo); //adds the two fracs
		System.out.println("\n\n1/2.add(1/3) = " + rOne);  //prints the result

		rOne.setRational(4, 10);
		rTwo.setRational(3, 5); //sets new fractions
		rOne.add(rTwo); //adds frac1 and frac2
		System.out.println("\n\n4/10.add(3/5) = " + rOne); //prints the result

		rOne.setRational(2, 10);
		rTwo.setRational(3, 6); //sets new fractions
		rOne.add(rTwo); //adds frac1 and frac2
		System.out.println("\n\n2/10.add(3/6) = " + rOne); //outputs result

		rOne.setRational(1, 4);
		rTwo.setRational(2, 8); //sets new fractions
		rOne.add(rTwo); //adds frac1 and frac2
		System.out.println("\n\n1/4.add(2/8) = " + rOne); //outputs result

		rOne.setRational(1, 6); //sets new fractions
		rTwo.setRational(2, 8);
		System.out.println( "1/6 > 2/8 == " + rOne.isBigger(rTwo) ); //determines if frac1 is bigger than frac2
		rOne.add(rTwo); //adds frac1 and frac2
		System.out.println("\n\n1/6.add(2/8) = " + rOne); //outputs result

		rOne.setRational(1, 2); //sets new fractions
		rTwo.setRational(2, 4);
		System.out.println( "\n\n1/2 == 2/4 is " + rOne.equals(rTwo) ); //determines if frac1 equals frac2
	}
}