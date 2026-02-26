/**
 * TotalRowRunner.java  03/24/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class TotalRowRunner //class
{
	public static void main( String[] args )
	{
		int[][] a = {{1, 2, 3}, {5, 5, 5, 5}}; //local matrix
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(a)); //outputs static method with matrix as a parameter
		int[][] b = {{1, 2, 3}, {5}, {1}, {2, 2}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(b));
		int[][] c = {{1, 2}, {5, 5}, {5, 5}, {4, 5, 6, 7}, {123124, 12312}}; //repeats with new parameters
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(c));
	}
}



