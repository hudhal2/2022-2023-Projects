/**
 * MultTableRunner.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class MultTableRunner
{
	public static void main( String[] args )
	{
	 	MultTable a = new MultTable( 5, 5 ); //refers runner to MultTable and provides parameters
		a.printTable(); //does method printTable with previously provided parameters

		System.out.println(""); //prints spaces
		System.out.println("");

		MultTable b = new MultTable( 3, 7 ); //repeats with new parameters (test case)
		b.printTable();

		System.out.println("");
		System.out.println("");

		MultTable c = new MultTable( 1, 6 ); //repeats with new parameters (test case)
		c.printTable();

		System.out.println("");
		System.out.println("");

		MultTable d = new MultTable( 9, 9 ); //repeats with new parameters (test case)
		d.printTable();

		System.out.println("");
		System.out.println("");

		MultTable e = new MultTable( 7, 8 ); //repeats with new parameters (test case)
		e.printTable();
	}
}