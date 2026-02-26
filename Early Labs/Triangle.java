/**
 * Triangle.java  10/09/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help Gabriel
 *
*/

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;

	public Triangle(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter()
	{
		perimeter = sideA + sideB + sideC;
	}

	public double getArea()
	{
		double s = perimeter / 2; //calculates perimeter
		return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); //find area of triangle
	}
}