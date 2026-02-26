/**
 * CoolChicken.java  11/17/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class CoolChicken
{
    private int wingCount; //defines instance variables
	private double speed;
	private String name;

    public CoolChicken( double s, int wc, String n )
    {
     	wingCount = wc; //sets values with constructor
		speed = s;
		name = n;
    }

    public double maxSpeed()
    {
      	return speed * wingCount; //method returning the maxspeed using multiplication
    }

    public boolean isCool()
    {
     	if (maxSpeed() > 1000 && name.contains("cool")) //boolean determining if the maxspeed of the test case is above 1000 and if it has 'cool' in the name
		{
		 	return true;
		}
        return false;
    }
}