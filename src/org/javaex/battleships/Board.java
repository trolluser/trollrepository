package org.javaex.battleships;

import java.awt.Point;
import java.security.InvalidParameterException;

public class Board {
	
	private Ship[] fleet;
	private Ship[] enemyFleet;
	
	private Point	boardSize;
	
	public Board() {	
		boardSize = new Point(10, 10);	
	}

	public Board(int width, int length) {
		
		boardSize = new Point(length, width);	
	}
	
	public Boolean hit(int x, int y) throws InvalidParameterException {
		if (x > boardSize.x || y > boardSize.y)
			throw new InvalidParameterException("hit("+ x + ", " + y + ") parameters are outside grid boundaries.");
		
		return false;
	}
	

	
	

}
