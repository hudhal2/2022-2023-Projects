/**
 * TweetRunner.java  11/11/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabe
 *
*/

public class TweetRunner
{
    public static void main(String[] args)
	{
		Tweet sample = new Tweet( "aplus", 0, 0 ); //refers the tweet.java command and gives parameters
		sample.addLikes( 3 ); //sets value for al
		sample.addRetweets( 28 ); //sets value for rt
		System.out.println( sample.notLiked() );
		System.out.println( sample.kindaLiked() ); //prints the booleans
		sample.addLikes( 35 ); //sets value
		System.out.println( sample.kindaLiked() );
		System.out.println( sample.isTrending() ); //prints booleans
		sample.addLikes( 13 );
		sample.addRetweets( 47 ); //sets values
		System.out.println( sample.notLiked() );
		System.out.println( sample.kindaLiked() ); //prints booleans
		System.out.println( sample.isTrending() );
		System.out.println( sample ); //prints the variable values
	}
}
