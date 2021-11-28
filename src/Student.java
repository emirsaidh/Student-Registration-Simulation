import java.util.ArrayList;

public class Student extends Person{
    
    StudentID studentID;
    int yearEnrolled;
    Schedule schedule;
    Transcript lastTranscript;
    Transcript nextTranscript;
    ArrayList<Course> collisionCourses;
    ArrayList<String> logs;

    public Student(int i, String string, String string2, String string3, StudentID studentID1, int j, Schedule schedule1, Transcript transcript1, Transcript transcript12, ArrayList<Course> oopPre, ArrayList<String> logsExample) {
    }


    public Student(Double ssn, String firstName, String lastname, String email, StudentID studentID,
            int yearEnrolled, Schedule schedule, Transcript lastTranscript, Transcript nextTranscript,
            ArrayList<Course> collisionCourses, ArrayList<String> logs) {
        super(ssn, firstName, lastname, email);
        this.studentID = studentID;
        this.yearEnrolled = yearEnrolled;
        this.schedule = schedule;
        this.lastTranscript = lastTranscript;
        this.nextTranscript = nextTranscript;
        this.collisionCourses = collisionCourses;
        this.logs = logs;
    }

    public void showTranscript(){}


    @Override
    public String toString() {
        return "Student [collisionCourses=" + collisionCourses + ", lastTranscript=" + lastTranscript+ ", First Name=" + super.getName() + ", logs=" + logs
                + ", nextTranscript=" + nextTranscript + ", schedule=" + schedule + ", studentID=" + studentID
                + ", yearEnrolled=" + yearEnrolled + "]";
    }
 
}
