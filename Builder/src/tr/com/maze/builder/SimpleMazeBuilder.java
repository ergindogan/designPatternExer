package tr.com.maze.builder;

import tr.com.maze.Maze;

public class SimpleMazeBuilder extends MazeBuilder {
	
	private Maze _currentMaze;
	
	public SimpleMazeBuilder(){
		_currentMaze = null;
	}

	@Override
	public Maze getMaze() {
		return _currentMaze;
	}

	@Override
	public void buildMaze() {
		_currentMaze = new Maze();
	}

	@Override
	public void buildRoom(int room) {
		System.out.println("I am building the room NO : " +  room );
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		System.out.println("I am building a door between " + roomFrom + "," + roomTo);
	}
}
