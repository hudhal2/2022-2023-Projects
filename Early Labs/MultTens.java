/**
 * MultTens.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Cody
 *
*/

public class MultTens
{
	public static String go(  int x ) //creates static so it can be accessed by the runner
	{
	 	if ( x <= 0 )
		{
		 	return "aplus"; //if the x value is less than 1 output aplus
		}

		else
		{
			String total = "";
		 	for ( int i = 1; i <= x; i += 1 )
			{
			 	total +=  "" + (i * 10); //return increasing multiplies of ten based on the inputted x value
			}
			return total;
		}
	}
}