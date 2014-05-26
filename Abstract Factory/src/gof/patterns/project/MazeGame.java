package gof.patterns.project;

import gof.patterns.models.Door;
import gof.patterns.models.Maze;
import gof.patterns.models.Room;
import gof.patterns.models.Room.Direction;

public class MazeGame {

	public Maze createMaze(MazeFactory factory){
		
		Maze maze = factory.makeMaze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door aDoor = factory.makeDoor(r1, r2);
		
		r1.setSide(Direction.North, factory.makeWall());
		r1.setSide(Direction.East, aDoor);
		r1.setSide(Direction.South, factory.makeWall());
		r1.setSide(Direction.West, factory.makeWall());
		
		r2.setSide(Direction.North, factory.makeWall());
		r2.setSide(Direction.East, factory.makeWall());
		r2.setSide(Direction.South, factory.makeWall());
		r2.setSide(Direction.West, aDoor);
		
		return maze;
		
	}
}
