/**
 * ExpressionSolverRunner.java 03/06/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class NumberAnalyzerRunner //class
{
	public static void main( String[] args )
	{
		int[] array = {5, 12, 9, 6, 1, 4, 8, 6 }; //local array
		NumberAnalyzer a = new NumberAnalyzer(array); //instantiates and gives ref
		System.out.println(a); //outputs NumberAnalyzer
		System.out.println("odd count = " + a.countOdds()); //outputs # of Odds
		System.out.println("even count = " + a.countEvens()); //outputs # of Evens
		System.out.println("perfect count = " + a.countPerfects() + "\n\n\n"); //outputs # of Perfects

		int[] array2 = {5, 12, 3, 7, 28, 496, 81, 65, 33, 11}; //repeats with new array
		NumberAnalyzer b = new NumberAnalyzer(array2);
		System.out.println(b);
		System.out.println("odd count = " + b.countOdds());
		System.out.println("even count = " + b.countEvens());
		System.out.println("perfect count = " + b.countPerfects() + "\n\n\n");

		int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 151, 16, 17, 18, 19, 20}; //repeats with new array
		NumberAnalyzer c = new NumberAnalyzer(array3);
		System.out.println(c);
		System.out.println("odd count = " + c.countOdds());
		System.out.println("even count = " + c.countEvens());
		System.out.println("perfect count = " + c.countPerfects() + "\n\n\n");
	}
}