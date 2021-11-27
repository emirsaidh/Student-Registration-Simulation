
public class FacultyMember extends Person {
	private ArrayList<Course> presentedCourses;
	private Schedule schedule;
	
	public FacultyMember() {
		
	}
	public FacultyMember(Double ssn, String firstName, String lastName,
			String email, ArrayList<Course> presentedCourse, Schedule schedule) {
		super(ssn, firstName, lastName, email);
		this.presentedCourses = presentedCourse;
		this.schedule = schedule;
		
	}
	

	public ArrayList<Course> getPresentedCourses() {
		return presentedCourses;
	}
	public void setPresentedCourses(ArrayList<Course> presentedCourses) {
		this.presentedCourses = presentedCourses;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	@Override
	public String toString() {
		
	}
}
