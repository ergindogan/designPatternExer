package tr.com.maze.builder;

import tr.com.maze.Maze;

public abstract class MazeBuilder {
	
	public Maze getMaze(){
		return null;
	}
	
	public void buildMaze(){
		
	}
	
	public void buildRoom(int room){
		
	}
	
	public void buildDoor(int roomFrom, int roomTo){
		
	}

	protected MazeBuilder(){
		
	}
}
