package tr.com.maze.factory;

import tr.com.maze.room.Room;
import tr.com.maze.room.RoomWithABomb;
import tr.com.maze.wall.BombedWall;
import tr.com.maze.wall.Wall;

public class BombedMazeFactory extends MazeFactory {

	@Override
	public Wall createWall() {
		return new BombedWall();
	}

	@Override
	public Room createRoom() {
		return new RoomWithABomb();
	}

}
