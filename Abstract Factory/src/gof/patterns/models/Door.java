package gof.patterns.models;

public class Door extends MapSite {

	private Room firstRoom;
	private Room secondRoom;
	private boolean isOpen;

	public Door(Room firstRoom, Room secondRoom) {
		this.firstRoom = firstRoom;
		this.secondRoom = secondRoom;
	}

	@Override
	public void enter() {
		System.out.println("Entered door From Room "
				+ firstRoom.getRoomNumber() + " To "
				+ secondRoom.getRoomNumber());
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Room otherSideFrom(Room room){
		return secondRoom;
	}
	
	
	
}
