import java.util.ArrayList;

public class Advisor extends FacultyMember {
	private ArrayList<Student> students;
	public Advisor() {
		
	}
	public Advisor(Double ssn, String firstName, String lastName,
			String email, ArrayList<Course> presentedCourses,
			Schedule schedule, ArrayList<Student> students) {
		super(ssn, firstName, lastName, email, presentedCourses, schedule);
		this.students = students;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	// public boolean checkCreditsForTechnicalElective(Student student, Course course) {
	// 	return True;
	// }
	// public boolean checkHourCollision(Student student, Course course) {
	// 	return True;
	// }
	public void detectConflict(Student student, Course course) {
		
	}
}
