package tr.com.maze;

import tr.com.maze.factory.MazeFactory;

public class Test {

	public static void main(String[] args) {
		MazeFactory myFactory = MazeFactory.INSTANCE();
		
		myFactory.createDoor();
		myFactory.createMaze();
		myFactory.createRoom();
		myFactory.createWall();
	}

}
