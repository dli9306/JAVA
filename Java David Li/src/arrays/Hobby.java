package arrays;

public class Hobby extends Thing {

	public Hobby(String description) {
		super(description);
	
	}

	public static Hobby randomHobby() {
		Hobby[] someHobbies = {new Hobby("Progamming"),new Hobby("Sports")
				,new Hobby("videogames"), new Hobby("watching television")
		};
		return someHobbies[(int)(Math.random()*someHobbies.length)];
	}

}
