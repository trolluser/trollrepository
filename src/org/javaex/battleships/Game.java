/**
 * 
 */
package org.javaex.battleships;

/**
 * @author matthieumaunier
 *
 */
public class Game {

	private Board	board;
	private Player	player;
	
	/**
	 * 
	 */
	public Game() {
		// TODO Auto-generated constructor stub
	}
	
	public void setupBoard()
	{
		// Board without specified size defaults to 10,10
		board = new Board(); 
		// Player creation
		player = new Player();
		
		
	}

}
