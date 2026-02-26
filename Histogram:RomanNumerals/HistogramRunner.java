/**
 * HistogramRunner.java  01/30/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from none
 *
*/

public class HistogramRunner
{
	public static void main(String[] args)
	{
		Histogram hist = new Histogram("1 5 3 4 5 5 5 4 3 2 5 5 5 3", 8); //instantiates + ref + paramters
		System.out.println( hist ); //outputs
		hist.changeCount( 3, 1 );
		hist.changeCount( 13, 5 ); //calls changeCount method
		hist.changeCount( 5, -2 );
		hist.changeCount( 2 , 3 );
		System.out.println( hist ); //outputs
		System.out.println( hist.getMax() ); //calls getMax method
		System.out.println(""); //gap
		hist.reset("1 1 1 -91 1 1 1 5 3 3 3 99 5 5 3", 6); //new paramters
		System.out.println( hist ); //outputs
		hist.changeCount( 5, 10 );
		hist.changeCount( 1, -3 );
		hist.changeCount( 4, 10203 ); //calls changeCount method
		hist.changeCount( 0, 7 );
		hist.changeCount( 2 , 3 );
		System.out.println( hist ); //outputs
		System.out.println( hist.getMax() ); //calls getMax method
	}
}

/*
expected output

0 - 0 | 1 - 1 | 2 - 1 | 3 - 3 | 4 - 2 | 5 - 7 | 6 - 0 | 7 - 0 |
0 - 0 | 1 - 1 | 2 - 4 | 3 - 4 | 4 - 2 | 5 - 5 | 6 - 0 | 7 - 0 |
5

0 - 0 | 1 - 6 | 2 - 0 | 3 - 4 | 4 - 0 | 5 - 3 |
0 - 7 | 1 - 3 | 2 - 3 | 3 - 4 | 4 - 10203 | 5 - 13 |
4

*/