import java.util.ArrayList;

public class Student extends Person{
    
    StudentID studentID;
    int yearEnrolled;
    Schedule schedule;
    Transcript lastTranscript;
    Transcript nextTranscript;
    ArrayList<Course> collisionCourses;
    ArrayList<String> logs;

    public Student() {
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

    

}
