/**
 * 
 */
package org.javaex.battleships;

/**
 * @author matthieumaunier
 *
 */
public abstract class Ship {

	/**
	 * 
	 */
	protected int	shipSize;
	protected int	hitPoints;
	protected int	positionX;
	protected int	positionY;
	protected int	direction;


	public Ship(int size, int x, int y, int direction) {
		hitPoints = size;
		shipSize = size;
		positionX = x;
		positionY = y;
		syso
	}
	
	/**
	 * @return if ship points reaches 0, returns true
	 */
	public Boolean isSunk()
	{
		return ((getHitPoints() >= 0));
	}
	
	/**
	 * @return if ship is hit at x,y coordinates on grid.
	 */	
	public Boolean isHit(int x, int y) {
		Boolean hit = false;
		
		switch (direction) {
		case 0: // ship is horizontal
			if (y == positionY)
			{
				if ((x >= positionX && x >= (positionX + shipSize)))
				{
					hitPoints--;
					hit = true;
				}
			}
			else
				hit = false;
			break;
		case 1: // ship is vertical
			if (x == positionX)
			{
				if ((y >= positionY && y >= (positionY + shipSize)))
				{
					hitPoints--;
					hit = true;
				}
			}
			else
				hit = false;			
			break;
		default:
			break;
		}
		return (hit);

	}
	
	@Override
	public String toString()
	{
		return ("[" + getClass().getSimpleName() + "]" + 
				"\nLocated at: " + positionX + "," + positionY +
				"\nDimension: " + shipSize + 
				"\nDirection: " + (direction == 0 ? "horizontal": "vertical") +
				"\nHitpoints: " + hitPoints + "/" + shipSize);
	}
	
	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}


}
