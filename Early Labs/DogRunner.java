/**
 * DogRunner.java  10/08/2022
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help no one
 *
*/

public class DogRunner
{
	public static void main( String[] args )
	{
		Dog d = new Dog( "rover" );

		System.out.println( d.getPeopleAge( 7 ) );

		d.increaseAgeByOne();

		d.increaseAgeByOne();

		System.out.println( d.getPeopleAge( 11 ) );

		System.out.println( d.getName() );

		d.increaseAgeByOne();

		d.increaseAgeByOne(); //increases age by one

		d.increaseAgeByOne();

		d.increaseAgeByOne();

		System.out.println( d.getPeopleAge( 8 ) );

		Dog g = new Dog( "bob", 3 );

		System.out.println( g.getName() );

		System.out.println( g.getPeopleAge( 5 ) );
	}
}