package tr.com.maze.factory;

import tr.com.maze.door.Door;
import tr.com.maze.door.DoorNeedingSpell;
import tr.com.maze.room.EnchantedRoom;
import tr.com.maze.room.Room;

public class EnchantedMazeFactory extends MazeFactory {

	@Override
	public Room createRoom() {
		return new EnchantedRoom();
	}

	@Override
	public Door createDoor() {
		return new DoorNeedingSpell();
	}

}
