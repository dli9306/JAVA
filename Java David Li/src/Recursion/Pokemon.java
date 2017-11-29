package Recursion;

public class Pokemon {
   
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name,int level) {
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
		
	}
	/*public static void main(String[] args) {
		Pokemon squirtle = new Pokemon("Squirtle",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();

	}
	*/
	public void iChooseYou() {
		System.out.println(name + ", "+  name);
		
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}
	public void lapse() {
		if(poisoned) {
		setHp(getHp()-15);
		}
	}
	
	 public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
		 attack.attack(target);
		 System.out.println("The attack hit");
		 }else{
		 System.out.println("The attack missed");
		 }
		 }
	 public void levelUp(Effect e) {
		 int oldLvl = getLevel();
		 setLevel(oldLvl+1);
	 }
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

}
