package tr.com.maze;

import tr.com.maze.builder.SimpleMazeBuilder;

public class Test {

	public static void main(String[] args) {
		Maze maze = null;
		
		MazeGame game = new MazeGame();
		
		SimpleMazeBuilder builder = new SimpleMazeBuilder();
		
		game.createMaze(builder);
		maze = builder.getMaze();

		
	}

}
