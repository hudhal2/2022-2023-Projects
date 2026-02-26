/**
 * SocialRunner.java  10/20/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Ian
 *
*/

public class SocialRunner
{
	public static void main( String[] args )
	{ //runs test cases with chopAndAdd command one by one and prints
	 	Social test1 = new Social("456-56-234");
		test1.chopAndAdd();
		System.out.println(test1);
		Social test2 = new Social("1-1-1");
		test2.chopAndAdd();
		System.out.println(test2);
		Social test3 = new Social("102-2-12");
		test3.chopAndAdd();
		System.out.println(test3);
		Social test4 = new Social("0-0-0");
		test4.chopAndAdd();
		System.out.println(test4);
	}
}