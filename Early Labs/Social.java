/**
 * Social.java  10/20/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Ian
 *
*/

public class Social
{
 	private String socialNum;
 	private int sum;

	public Social()
	{
	}

	public Social(String soc)
	{
	 	socialNum = soc;
	}


	public void setWord(String w)
	{
	 	socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
		int dash1 = sub.indexOf("-");
		int dash2 = sub.lastIndexOf("-"); //defines dash
		String s1 = sub.substring(0, dash1);
		String s2 = sub.substring(dash1 + 1, dash2); //segments out numbers between dashes prev defined
		String s3 = sub.substring(dash2 + 1, sub.length());
		int ns1 = Integer.parseInt(s1); //creates ints from segments
		int ns2 = Integer.parseInt(s2);
		int ns3 = Integer.parseInt(s3);
		sum = ns1 + ns2 + ns3; //adds segments
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}