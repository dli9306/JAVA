package caveExplorer;

public class CaveRoom {
	
	private String description;//tells what the room looks like
	private String directions;//tells what you can do
	private String contents;//a symbol representing what's in the room
	private String defaultContents;
	//the rooms are organized by direction, 'null' signifies no room/door in that direction
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	//constants
	public static final int NORTH =0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;

	public CaveRoom(String description) {
		this.description = description;
		setDefaultContents(" ");
		contents = defaultContents;
		//difference between defaultContents and contents is "contents" becomes an 'X' when you are
		//inside this room, when you leave , it goes back to defaultContents
		
		//note: by default,arrays will populate with 'null' meaning there are no connections
		borderingRooms = new CaveRoom[4];
		doors = new Door[4];
		setDirections();
	}
	
	/**
	 * for every door in doors[] appends a String to "directions" describing the access
	 * For example:
	 * "There is a door to the north"
	 * "There is a door to the south"...etc
	 * 
	 * If there are no doors at all,directions should say:
	 *  "There are no doors, you are trapped in here."
	 */

	public void setDirections() {
		directions = "";
		boolean doorFound = false;
		for(int i=0;i<doors.length;i++) {
			if(doors[i] != null) {
				doorFound = true;
				directions += "\n There is a "+doors[i].getDescription() + " to " + 
				toDirection(i) + ". "+doors[i].getDetails();
			}
		}
		if(!doorFound) {
			directions += "There is no way out. You are trapped in here.";
		}
		
	}
	
	/**
	 * converts an int to a direction
	 * toDirection(0) -> "the North"
	 * etc
	 * @param dir
	 * @return
	 */
	
	public static String toDirection(int dir) {
		String[] directions = {"the North"," the East"," the South"," the West"};
		return directions[dir];
	}
	
	public void enter() {
		contents = "X";
	}
	
	public void leave() {
		contents = defaultContents;
	}
	
	/**
	 * Gives this room access to anotherRoom (and vice-versa)
	 * and sets a door between them, updating the directions
	 * @param direction
	 * @param anotherRoom
	 * @param door
	 */
	
	public void setConnection(int direction, CaveRoom anotherRoom, Door door) {
		addRoom(direction,anotherRoom,door);
		anotherRoom.addRoom(oppositeDirection(direction), this, door);
	  }

	public static int oppositeDirection(int direction) {
		return (direction+2)%4;
	}

	public void addRoom(int direction, CaveRoom cave, Door door) {
		borderingRooms[direction] = cave;
		doors[direction]=door;
		setDirections();
		
	}
	
	public void interpretInput(String input) {
		while(isValid(input)) {
			System.out.println("You can only enter 'w','a','s', or'd'");
			input = CaveExplorer.in.nextLine();
		}
		//task: convert user input into a direction
		//DO NOT USE AN IF STATEMENT
		//or if you must, don't use more than one
		String dirs ="wdsa";
		goToRoom(dirs.indexOf(input));
	}

	private boolean isValid(String input) {
		String validEntries = "wdsa";
		return validEntries.indexOf(input) > -1 && input.length() ==1;
	}

	private void goToRoom(int direction) {
	   //first, protect against null pointer exception
	   // user cannot go through a non-existent door
		if(borderingRooms[direction] != null && doors[direction] != null) {
			CaveExplorer.currentRoom.leave();
			CaveExplorer.currentRoom = borderingRooms[direction];
			CaveExplorer.currentRoom.enter();
			CaveExplorer.inventory.updateMap();
			
		}
		
	}
	
	/**
	 * This will be where you group sets up all the caves
	 * and all the connections
	 */
	public static void setUpCaves() {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public void setDefaultContents(String defaultContents) {
		this.defaultContents = defaultContents;
	}
	
	

}