/**
 * Tweet.java  11/11/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabe
 *
*/

class Tweet
{
	private String message; //defining instance variables
	private int retweets;
	private int likes;

	public Tweet( String m, int r, int lk ) //set values in first contructor for instance variables
	{
		message = m;
		retweets = r;
		likes = lk;
	}

	public void addLikes( int n ) //adds value to likes varibale
	{
		likes += n;
	}

	public void addRetweets( int n ) //adds value to retweets varibale
	{
		retweets += n;
	}

	public boolean notLiked() //returns true if likes is less than 10
	{
		if (likes < 10)
		{
			return true;
		}
		return false;
	}

	public boolean kindaLiked() //returns true if likes is greater than retweets
	{
		if (likes > retweets)
		{
			return true;
		}
		return false;
	}

	public boolean isTrending() //returns true if retweets and likes are greater than 75 combined
	{
		if ((retweets + likes) > 75)
		{
			return true;
		}
		return false;
	}

	public String toString() //outputs the variables + text
	{
		return "msg " + message + " rt " + retweets + " lk " + likes;
	}
}