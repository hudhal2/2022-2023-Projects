/**
 * Social2Runner.java  01/13/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

import java.io.IOException;
import java.io.File; //imports scanner and file and ioexception
import java.util.Scanner;

public class SocialRunner2
{
	public static void main( String[] args ) throws IOException //removes error
	{
		Scanner file = new Scanner(new File("social.dat")); //ref for scanner for data
		int size = file.nextInt(); //sets size to the first int
		file.nextLine(); //goes to next line
		Social2 a = new Social2(); //ref var for Social2
		for (int i = 0; i < size; i++) //repeats until it reaches size
		{
			a.setSocial(file.nextLine());
			System.out.println(a); //runs social2
		}
	}
}