/**
 * AngryBear.java  11/16/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

class AngryBear
{
    private int days; //defines instance variables
	 private int teeth;

    public AngryBear( int one, int two ) //sets varibles to parameters with constructor
    {
	  		days = one;
			teeth = two;
    }

    public boolean isAngry()
    {
      	if (days > 3 && teeth < 10) //runs boolean with the instance variables
			{
			 	return true;
			}
			else if (teeth == 0)
			{
			 	return true;
			}
			else if (days > 5)
			{
			 	return true;
			}
    		return false;
    }
}