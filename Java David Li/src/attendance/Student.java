package attendance;

public class Student implements Attendee {

	private boolean present;
	public Student(firstName,lastName){}
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
		return "David";
	}

	@Override
	public String getLastName() {
		return "Li";
	}

	@Override
	public boolean mathces(String first, String last) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean matches(String last) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getReportString() {
		// TODO Auto-generated method stub
		return null;
	}



}
