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

public class StringRemoverRunner
{
	public static void main( String[] args )
	{
	 	StringRemover a = new StringRemover( "xR-MxR-MHelloxR-M", "R-M" );
	 	a.removeStrings();
		System.out.println("xR-MxR-MHelloxR-M - String to remove R-Ma");
		System.out.println(a);
		System.out.println("");
		System.out.println("");

		StringRemover b = new StringRemover( "sxsssxssxsxssexssxsesss", "xs" );
	 	b.removeStrings();
		System.out.println("sxsssxssxsxssexssxsesss - String to remove xs");
		System.out.println(b);
		System.out.println("");
		System.out.println("");

		StringRemover c = new StringRemover( "fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty" );
	 	c.removeStrings();
		System.out.println("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn - String to remove qwerty");
		System.out.println(c);
		System.out.println("");
		System.out.println("");

		StringRemover d = new StringRemover( "dogdogcatddodogdogdoggog", "dog" );
	 	d.removeStrings();
		System.out.println("dogdogcatddodogdogdoggog - String to remove dog");
		System.out.println(d);
	}
}