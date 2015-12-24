package tr.com.maze.factory;

import tr.com.maze.door.Door;
import tr.com.maze.maze.Maze;
import tr.com.maze.room.Room;
import tr.com.maze.wall.Wall;

public class MazeFactory {
	
	//Default implementation of the all factories that will extend from MazeFactory.
	public Wall createWall(){
		return new Wall();
	}
	
	//Default implementation of the all factories that will extend from MazeFactory.
	public Room createRoom(){
		return new Room();
	}
	
	//Default implementation of the all factories that will extend from MazeFactory.
	public Door createDoor(){
		return new Door();
	}
	
	//Default implementation of the all factories that will extend from MazeFactory.
	public Maze createMaze(){
		return new Maze();
	}

}
