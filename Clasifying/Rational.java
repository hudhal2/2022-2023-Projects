/**
 * Rational.java  01/5/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class Rational
{
	private int num1;
	private int den1; //instance variables

	public Rational() //2nd constructor
	{
		num1 = 0;
		den1 = 0;
	}

	public Rational(int n1, int d1) //Constructor with parameter for numerator and denom
	{
		num1 = n1; //sets variables to parameters
		den1 = d1;
	}

	public void setRational(int n1, int d1) //sets variables to values in parameter
	{
		num1 = n1;
		den1 = d1;
	}

	public boolean isBigger(Object obj) //boolean method with object to use 2nd set of instance variables
	{
		Rational other = (Rational)obj; //sets ref 'other' to obj
		if (((double)num1 / den1) > ((double)other.num1 / other.den1)) //if frac1 is greater than frac2
		{
			return true; //return true
		}
		return false; //otherwise false
	}

	public boolean equals(Object obj)
	{
		Rational other = (Rational)obj; //object ref
		if ((double)(num1 / den1) == (double)(other.num1 / other.den1)) //if frac1 == frac2
		{
			return true; //return true otherwise false
		}
		return false;
	}
	public void add(Object obj)
	{
		Rational other = (Rational)obj; //ref obj
		num1 = num1 * other.den1 + other.num1 * den1; //performs calculations to set num of new frac using ref 'other' for 2nd obj
		den1 = den1 * other.den1; //calc denom using obj
		other.reduce(); //calls reduce method
		reduce();
	}

	public void reduce() //reduce method
	{
		int gcf = 1; //sets temp var to 1
		for (int i = 1; i <= num1 || i <= den1; i++) //for loop repeats until it reaches value of the smallest variable
		{
			if ( num1 % i == 0 && den1 % i == 0)
			{
				gcf = i; //sets gcf to i if they are both divisible by i
			}
		}
		num1 = num1 / gcf; //divides variables by gcf
		den1 = den1 / gcf;
	}

	public int hashCode() //performs hashcode function to not get rand numbers
	{
		return 0;
	}

	public String toString()
	{
		return "" + num1 + " \\ " + den1; //outputs the variables (num1/den1)
	}
}