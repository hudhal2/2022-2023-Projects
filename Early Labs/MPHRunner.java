/**
 * MPHRunner.java  9/31/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/


public class MPHRunner
{
	public static void main( String[] args )
	{
		MilesPerHour ref = new MilesPerHour(); //refers code for MPH
		System.out.println("45 0 32 = " + String.format("%.0f", MilesPerHour.getMPH(45, 0 , 32)) + " MPH");
		System.out.println("96 1 43 = " + String.format("%.0f", MilesPerHour.getMPH(96, 1, 43)) + " MPH");
		System.out.println("100 2 25 = " + String.format("%.0f", MilesPerHour.getMPH(100, 2, 25)) + " MPH");
		System.out.println("50 2 25 = " + String.format("%.0f", MilesPerHour.getMPH(50, 2, 25)) + " MPH");
		System.out.println("10 10 19 = " + String.format("%.0f", MilesPerHour.getMPH(10, 10, 19)) + " MPH");
		System.out.println("100 50 77 = " + String.format("%.0f", MilesPerHour.getMPH(100, 50, 77)) + " MPH");
	}
}

/*

45 0 32 = 84 MPH
96 1 43 = 56 MPH
100 2 25 = 41 MPH
50 2 25 = 21 MPH
10 10 19 = 1 MPH
100 50 77 = 2 MPH

*/