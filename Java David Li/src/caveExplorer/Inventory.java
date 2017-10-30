package caveExplorer;

public class Inventory {
	
	private String map;

	public Inventory() {
		updateMap();
	}

	public void updateMap() {
		map = " ";
		
		
	}

	public String getDescription() {
		return "You have nothing in your inventory.";
	}

}
