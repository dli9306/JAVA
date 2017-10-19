package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr","M","L","Gr","Ph","B","A","Th"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","er","et","a","ala","ina","ara"};
	public static final String[] FIRST_END = {"","na","n","t","tian","s","rs","an","mp","les"};
	
	public static final String[] LAST_START = {"Thomp","Tr","L","Br","Ph","Sh","Y","A"};
	public static final String[] LAST_MIDDLE = {"om","o","an","ola","e","is","ina","ara"};
	public static final String[] LAST_END = {"","son","eres","i","rian","ston","sk","an","na"};
	
	

  private String firstName;
  private String lastName;
  private Borough home;
  private Hobby hobby;
  private Person[] friends;
	public Person(String firstname,String lastname,Borough home) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	/**
	 * chooses friends from people based on who is of the same class
	 * as this instance and who has the same hobbies
	 * @param people
	 */
	public void mingle(Person[] people) {
		
	}
	/**
	 * Moves all Person in Friends back one index and puts p at index 0
	 * @param p
	 */
	public void addFriendsToFirstPlace(Person p) {
		
	}
	
	public String toString() {
		return "My name is " + firstName+" "+lastName+" and I live in "+home+".";
	}
	

}
