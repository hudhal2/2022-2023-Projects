/**
 * ElevensGUIRunner.java  05/19/2023
 *
 * @author - Hudson Haley
 * @author - Period 2
 * @author - Id 894201
 *
 * @author - I received help from Gabe
 *
*/

/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 */
public class ElevensGUIRunner {

	/**
	 * Plays the GUI version of Elevens.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ElevensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
