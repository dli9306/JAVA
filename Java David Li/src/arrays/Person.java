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
  private String nickname;
  private Hobby hobby;
  private Person[] friends;
	public Person(String firstname,String lastname,Borough home) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
		this.nickname = createUsername(firstName);
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = createUsername(firstName);
	}
	/**
	 * chooses friends from people based on who is of the same class
	 * as this instance and who has the same hobbies
	 * @param people
	 */
	public void mingle(Person[] people) {
		System.out.println("I am in the class" + this.getClass());
		for(Person p: people) {
			if(p!= this) {
				//reassign p to the better of the two friends: your current best friend or p
				p = betterFriend(p,friends[0]);
				addFriendsToFirstPlace(p);
			}
		}
	}
	private Person betterFriend(Person p, Person q) {
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		if(p.getClass()== this.getClass() && q.getClass()== this.getClass()) {
			if(p.hobby == this.hobby) {
				return p;
			}
			else
				if(q.hobby == this.hobby) {
					return q;
				}
		}
		// if none of these are true, just take p
		return p;
	}
	public void printFriends() {
		System.out.println("my name is "+ firstName+lastName+" and these are my friends: " );
		for(Person f:friends)
		{
			if(f!=null) System.out.println(f);
		}
	}
	/**
	 * Moves all Person in Friends back one index and puts p at index 0
	 * @param p
	 */
	public void addFriendsToFirstPlace(Person p) {
		//loop goes backward
		for(int i=friends.length-1;i<0;i--)
		{
			//.. and moves each friend back a position
			friends[i] = friends[i-1];
		}
		friends[0] = p;
	}
	
	public String toString() {
		return "My name is " + firstName+" "+lastName+" and I live in "+home+". "+"Call me "+nickname+".";
	}
	//JAVA IS PASS-BY-VALUE
	//meaing the parameters of a method are just values not references
	// so if you change those values, the original object is not affected
	// in this case, name will not be changed.In fact, NOTHING can change
	//the this.firstName via name
	public static String createUsername(String name)
	{
		String nickname = "";
		int secondVowelPsn = findSecond(name);
		nickname = name.substring(0,secondVowelPsn);
		return nickname;

	}
	private static int findSecond(String word) {
		boolean foundVowel = false;
		int index = word.length();
		word = word.toLowerCase();
		for(int i=0;i<word.length();i++) {
			if(word.substring(i,i+1).equals("a") ||
					word.substring(i,i+1).equals("e") ||
					word.substring(i,i+1).equals("i") ||
					word.substring(i,i+1).equals("o") ||
					word.substring(i,i+1).equals("u")) {
				if(!foundVowel) {
					foundVowel = true;
				}else {
					return i;
				}
				
			}
		}
		return index;
	}
	

}
