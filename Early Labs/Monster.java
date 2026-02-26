/**
 * Monster.java  11/10/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

public class Monster
{
	private String name;
	private int findSize; //classifies instance varibles

	public Monster(String n, int size) //constructor defines varibles
	{
		name = n;
		findSize = size; //sets instance varibles  to parameters
	}
	public String findName()
	{
		return name + "" + findSize; //combines name and size
	}
	public int getFindSize()
	{
		return findSize; //returns size
	}
	public boolean isBigger(Monster other)
	{
		if (findSize > other.findSize) //returns true if size of monster is greater than other monster
		{
			return true;
		}
		return false;
	}
	public boolean isSmaller(Monster other) //returns true is size of monster is less than other monster
	{
		if (!isBigger(other))
		{
			return true;
		}
		return false;
	}
	public boolean sameName(Monster other) //returns true if size is size of monster is equal to other monster
	{
		if (name.equals(other.name))
		{
			return true;
		}
		return false;
	}
	public String toString() //returns name and size
	{
		return name + " " + findSize;
	}
}