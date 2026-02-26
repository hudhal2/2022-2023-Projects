/**
 * RomanNumeralRunner.java  01/26/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from no one
 *
*/

public class RomanNumeralRunner //class
{
	public static void main( String[] args )
	{
		RomanNumeral test = new RomanNumeral(10); //instantiates and makes ref 'test' as well as provides initial paramter
		System.out.println("10 is " + test); //outputs using 10

		test.setNumber(100); //runs 'setNumber' method using '100' as a paramter
		System.out.println("100 is " + test); //outputs

		test.setNumber(1000);
		System.out.println("1000 is " + test);

		test.setNumber(2500);
		System.out.println("2500 is " + test);

		test.setNumber(1500);
		System.out.println("1500 is " + test); //repeats with new test cases

		test.setNumber(23);
		System.out.println("23 is " + test);

		test.setNumber(38);
		System.out.println("38 is " + test);

		test.setNumber(49);
		System.out.println("49 is " + test);

		test.setRoman("LXXVII"); //calls 'setRoman' method using paramter
		System.out.println("LXXVII is " + test.getNumber() + "\n"); //outputs

		test.setRoman("XLIX");
		System.out.println("XLIX is " + test.getNumber() + "\n");

		test.setRoman("XX");
		System.out.println("XX is " + test.getNumber() + "\n"); //repeats with new parameters

		test.setRoman("XXXVIII");
		System.out.println("XXXVIII is " + test.getNumber() + "\n");
	}
}