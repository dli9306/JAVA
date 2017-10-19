package arrays;

public class ObjectArrays {

	public ObjectArrays() {
	    Object[] people = new Object[20];
	    populate(people);
	    people[0] = new Thing ("coffee maker");
	    for(Object p: people) {
	    	System.out.println(p);
	    }
	    
	    
	}

	private void populate(Object[] people) {
		for(int i=0;i < people.length;i++) {
    		String firstName = randomNameFrom(Person.FIRST_START,Person.FIRST_MIDDLE,Person.FIRST_END);
    		String lastName = randomNameFrom(Person.LAST_START,Person.LAST_MIDDLE,Person.LAST_END);
    		Borough b = randomBorough();
    		//BIG IDEA!!!
    		//In Object[] (but not primitives arrays like int[] or double[])
    		// you can have multiple data types(subclasses of the declared type)
    		if(Math.random() < .6) {
    			//60% of the time..
    			int grade = (int)(Math.random()*5)+9;
    			people[i] = new Student(firstName,lastName,b,grade);
    		}else {
    			//40% of the time..
    			people[i] = new Person(firstName,lastName,b);
    		}
		}
    		

}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		
		return get(a)+get(b)+get(c);
	}

	private String get(String[] a) {
		return a[(int)(Math.random()*a.length)];
	}
	 public Person[] selectGroup(Person[] population, int length) {
	    	// returns a random subgroup;
	       Person[] randomGroup = new Person[length];
	       randomGroup[0] = selectAPerson(population);
	    	for(int i =0;i<length;i++) {
	    		Person nextPerson = selectAPerson(population);
	    		while(personInGroup(randomGroup,nextPerson)){
	    			 nextPerson = selectAPerson(population);
	    		}
	    		randomGroup[i] = nextPerson;
	    	}
	    	return randomGroup;
	    }

		public static boolean personInGroup(Person[] randomGroup, Person nextPerson) {
			for(int i=0;i<randomGroup.length;i++) {
				if(randomGroup[i] == nextPerson)
				{
					return true;
				}
			}
			return false;
		}

		private Person selectAPerson(Person[] population) {
			return population[(int) (Math.random()*population.length)];
		}
   
}
