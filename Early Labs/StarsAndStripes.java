/**
 * StarsAndStripes.java  09/28/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Ian
 *
*/

public class StarsAndStripes
{
 	public StarsAndStripes()
    {
     	System.out.println("StarsAndStripes");
        printTwoBlankLines();
    }

    public void printTwentyStars()
    {
     	System.out.println("********************");
    }

    public void printTwentyDashes()
    {
   		System.out.println("--------------------");
    }

    public void printTwoBlankLines()
    {
   		System.out.println("");
   		System.out.println("");
    }

    public void printASmallBox()
    {
    	printTwentyDashes();
    	printTwentyStars();
    	printTwentyDashes();
    	printTwentyStars();
    	printTwentyDashes();
    	printTwentyStars();
    	printTwentyDashes();
    }

    public void printABigBox()
    {
   		printASmallBox(); //Uses previous objects to print new one
   		printASmallBox();
    }
}