/**
 * StringRemover.java  11/28/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabriel
 *
*/

class StringRemover
{
 	private String remove;
    private String sentence;

	public StringRemover( String sen, String rem )
	{
		remove = rem;
		sentence = sen;
	}

	public void removeStrings()
	{
		while (sentence.indexOf(remove) > -1)
		{
			if (sentence.indexOf(remove) == 0)
			{
				sentence = sentence.substring(0, sentence.indexOf(remove)) + sentence.substring(sentence.indexOf(remove) + remove.length(), sentence.length());
			}
			else
			{
				sentence = sentence.substring(0, sentence.indexOf(remove) - 1) + sentence.substring(sentence.indexOf(remove) + remove.length(), sentence.length());
			}
		}
	}

	public String toString()
	{
		return sentence;
	}
}