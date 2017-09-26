package attendance;

public class Student implements Attendee {

	private boolean present;
	private String firstName;
	private String lastName;

	public Student(String firstName, String lastName){}
	@Override
	public boolean isPresent() {
		if(present)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void setPresent(boolean present) {
		this.present = present;
		
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public boolean mathces(String first, String last) {
		if(first.toLowerCase().equals(firstName) && last.toLowerCase().equals(lastName) ) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean matches(String last) {
		if(last.toLowerCase().equals(lastName)) {
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public String getReportString() {

		if(lastName.length()>20) {
	       lastName = lastName.substring(0, 17) + "...";
		}
		String t = lastName;
		 while(t.length() <20)
		 {
			 t+=" ";
		 }
		 
		 if(firstName.length()>20) {
		       firstName = firstName.substring(0, 17) + "...";
			}
			String x = firstName;
			 while(x.length() <20)
			 {
				 x+=" ";
			 }
		 if(present)
		 {
			 String finalString = t + x + "Present ";
			 return finalString;
		 }
		 else
		 {
			 String finalString = t + x + "Present ";
			 return finalString;
		 }

	}



}
