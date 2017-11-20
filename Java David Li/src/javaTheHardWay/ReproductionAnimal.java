package javaTheHardWay;

public class ReproductionAnimal extends RoamingAnimal {
	
	private int maxLitter;

	public ReproductionAnimal(Habitat matingArea) {
		super(matingArea);
		maxLitter = 1;
	}
	public ReproductionAnimal(Habitat matingArea,String description,Trait trait1,Trait trait2) {
		super(matingArea,description,trait1,trait2);
		maxLitter = 1;
	}

	public static void main(String[] args) {
		Habitat h = new Habitat(3);

	}

}
