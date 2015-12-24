package tr.com.maze;

import tr.com.maze.factory.BombedMazeFactory;
import tr.com.maze.factory.EnchantedMazeFactory;
import tr.com.maze.factory.MazeFactory;

public class Test {

	public static void main(String[] args) {
		MazeFactory myFactory = new BombedMazeFactory();
		
		myFactory.createDoor();
		myFactory.createMaze();
		myFactory.createRoom();
		myFactory.createWall();
	}

}
