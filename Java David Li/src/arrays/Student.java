package arrays;

public class Student extends Person {
	
	public static final String[] grades = {"Freshman","Sophmores","Junior","Senior","Super Senior"};
	
   private String grade;
 	
	public Student(String firstname, String lastname, Borough home, int gradeLevel) {
		super(firstname, lastname, home);//super constructor is first because a person must exists before a student can exist
		int index = gradeLevel-9;
		this.grade = grades[index];
	}

	public String toString() {
		//NOTE: If you want to call the parent method, use super.
		return super.toString()+" I am also a "+ grade+".";
	}
}
