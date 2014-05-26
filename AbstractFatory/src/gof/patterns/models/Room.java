package gof.patterns.models;

public class Room extends MapSite{

	private int roomNumber;
	private MapSite sides[];
	public enum Direction { North,South,East,West };
	
	public Room(int roomNo){
		this.roomNumber = roomNo;
		this.sides = new MapSite[4];
	}
	
	public MapSite getSide(Direction direction) {
		return this.sides[direction.ordinal()];
	}
	
	public void setSide(Direction direction, MapSite map){
		this.sides[direction.ordinal()] = map;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
}
